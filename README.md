# Topicos_Especiais
Para instalar as dependencia é só usar o comando:
``` bash
pip install -r requirements.txt
```

Para rodar o servidor é so usar o comando:
``` bash
avicorn main:app --reaload
```

Ou para executar em host ou uma porta especifica: 
```bash
uvicorn main:app --host 0.0.0.0 --port 3030
```
