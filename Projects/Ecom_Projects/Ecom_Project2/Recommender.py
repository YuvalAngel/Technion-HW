import numpy as np


class Recommender:
    def __init__(self, n_weeks: int, n_users: int, prices: np.array, budget: int):
        self.n_rounds = n_weeks
        self.n_users = n_users
        self.item_prices = prices
        self.budget = budget
    
    def recommend(self) -> np.array:
        pass
    
    def update(self, results: np.array):
        pass