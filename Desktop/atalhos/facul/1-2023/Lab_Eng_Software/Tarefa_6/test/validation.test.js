const Constants = require('../src/utils/Constants');
const Validation = require('../src/utils/validation');

it('Caso válido', () => {
    const result = Validation.create({
        nome: "Resident Evil Cut",
        produtora: "Disney",
        ano: 2025,
        nota: 10
    });
    expect(result).toEqual(undefined);
});

it('Caso inválido - sem o parâmetro nome', () => {
    const result = Validation.create({
        produtora: "Disney",
        ano: 2025,
        nota: 10
    });
    expect(result.name).toEqual(Constants.ErrorValidation.name);
});

it('Caso inválido - sem o parâmetro produtora', () => {
    const result = Validation.create({
        nome: "As Branquelas",
        ano: 2004,
        nota: 8
    });
    expect(result.produtora).toEqual(Constants.ErrorValidation.produtora);
});

it('Caso inválido - sem o parâmetro ano', () => {
    const result = Validation.create({
        nome: "Vingadores",
        produtora: "Marvel Studios",
        nota: 10
    });
    expect(result.ano).toEqual(Constants.ErrorValidation.ano);
});

it('Caso inválido - sem o parâmetro nota', () => {
    const result = Validation.create({
        nome: "Silent Hill",
        produtora: "Konami",
        ano: 2024
    });
    expect(result.nota).toEqual(Constants.ErrorValidation.nota);
});

it('Caso inválido - sem o parâmetro nota e ano', () => {
    const result = Validation.create({
        nome: "Half Life",
        produtora: "Valve"
    });
    expect(result.nota).toEqual(Constants.ErrorValidation.nota);
});

it('Caso inválido - sem o parâmetro nome e produtora', () => {
    const result = Validation.create({
        ano: 2025,
        nota: 10
    });
    expect(result.nota).toEqual(Constants.ErrorValidation.nota);
});
