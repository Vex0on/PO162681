import sys
import random as rand


def numberGuessingGame():
    rnd = rand.randint(1, 256)
    guess = None

    while guess != rnd:
        guess = int(input("Wprowadź liczbę: "))
        if guess > rnd:
            print("za dużo")
        elif guess < rnd:
            print("za mało")
        else:
            print("Prawidłowa odpowiedź")


numberGuessingGame()
while True:
    again = str(input("Chcesz zagrać ponownie? (tak/nie)")).lower()
    if again == "tak":
        numberGuessingGame()
    elif again == "nie":
        sys.exit(0)

