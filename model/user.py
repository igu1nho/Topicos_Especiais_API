class User:
    def __init__(self, registro, nome, unidade, ativo_unidade, planos, admin, permissoes = None):
        self.registro = registro
        self.nome = nome
        self.unidade = unidade
        self.ativo_unidade = ativo_unidade
        self.planos = planos
        self.admin = admin
        if admin:
            self.permissoes = permissoes

    

    