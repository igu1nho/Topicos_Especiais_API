from fastapi import FastAPI

app = FastAPI()

@app.get("/")
async def root():
     return {"Message": "Bem vindos a Topicos Especiais :)"}