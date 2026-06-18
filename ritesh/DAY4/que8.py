total_hours = 0

for day in range(1, 8):
    hours = int(input(f"Day {day}: "))
    total_hours += hours

print("Total Study Hours This Week:", total_hours)
