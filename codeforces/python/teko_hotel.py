class Customer:
    def __init__(self, arrive, stay):
        self.arrive = arrive
        self.stay = stay
        self.end = arrive + stay


def solve(n, arrive_time, stay_time):
    customer_list = []
    for a, s in zip(arrive_time, stay_time):
        customer_list.append(Customer(a, s))
    customer_list.sort(key=lambda x: x.arrive, reverse=True)
    rooms = []
    current_time = None
    for customer in customer_list:
        if current_time is None:
            current_time = customer.arrive
            number_of_room = 1
            continue


print(solve(5, [1, 2, 3], [3, 3, 3]))
