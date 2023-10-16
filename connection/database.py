from pymongo import MongoClient
import os


class Database:
    def __init__(self, mongo_uri):
        self.mongo_uri = mongo_uri

    def get_database(self):
         return MongoClient(self.mongo_uri)


if __name__ == "__main__":
    conn = Database(os.environ.get("url_mongo"))
    conn.get_database()