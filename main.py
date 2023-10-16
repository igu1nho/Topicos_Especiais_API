from fastapi import FastAPI
from dotenv import load_dotenv
from database import get_database

load_dotenv()

app = FastAPI()

get_database()

@app.get("/")
async def root():
     return {"Message": "Bem vindos a Topicos Especiais :)"}