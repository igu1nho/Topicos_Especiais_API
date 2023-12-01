const Cars = require('../src/application/car_service');
const Constants = require('../src/utils/Constants');
const Utils = require('../src/utils/utils');
const CarsRepository = require('../src/port/car_repository');

jest.mock('../src/port/car_repository');

it('should create a car', async () => {
    const data = {
        placa: 'CIE5927',
        marca: 'Tesla',
        nome: 'Model Y',
        ano: 2023,
        km: 0,
    };

    const id = Utils.generateUuid();

    CarsRepository.create.mockResolvedValue({ ...data, id });

    const response = await Cars.create(data);

    expect(response).toEqual({ ...data, id });
});

it('should not create a car', async () => {
    const data = {
        marca: 'Tesla',
        nome: 'Model Y',
        ano: 2023,
        km: 0,
    };

    const response = await Cars.create(data);

    expect(response.name).toEqual(Constants.ErrorValidation.name);
});

it('should update a car', async () => {
    const data = {
        id: Utils.generateUuid(),
        placa: 'CIE5927',
        km: 100,
    };

    CarsRepository.update.mockResolvedValue(data);

    const response = await Cars.update(data);

    expect(response).toEqual(data);
});

it('should not update a car', async () => {
    const data = {
        id: Utils.generateUuid(),
        nome: 'Model Y',
        kmR: 2500,
    };

    const response = await Cars.update(data);

    expect(response.name).toEqual(Constants.ErrorValidation.name);
});

it('should delete a car', async () => {
    const data = {
        placa: 'CIE5927',
    };

    CarsRepository.deleteByPlaca.mockResolvedValue(data);

    const response = await Cars.deleteByPlaca(data);

    expect(response).toEqual(data);
});

it('should not delete a car', async () => {
    const data = {
        nome: 'Model Y',
    };

    const response = await Cars.deleteByPlaca(data);

    expect(response.name).toEqual(Constants.ErrorValidation.name);
});

it('should get all cars', async () => {
    const data = [
        {
            placa: 'CIE5927',
        },
        {
            placa: 'KSA7938',
        },
    ];

    CarsRepository.list.mockResolvedValue(data);

    const response = await Cars.list();

    expect(response).toEqual(data);
});

it('should not get all cars', async () => {
    const data = [
        {
            nome: 'Model Y',
        },
        {
            nome: 'Model X',
        },
    ];

    const response = await Cars.list(data);

    expect(response.placa).toEqual(Constants.ErrorValidation.placa);
});

it('should get car by placa', async () => {
    const data = {
        placa: 'CIE5927',
    };

    CarsRepository.getByPlaca.mockResolvedValue(data);

    const response = await Cars.listByPlaca(data);

    expect(response).toEqual(data);
});

it('should not get car by placa', async () => {
    const data = {
        nome: 'Model Y',
    };

    const response = await Cars.listByPlaca(data);

    expect(response.name).toEqual(Constants.ErrorValidation.name);
});
