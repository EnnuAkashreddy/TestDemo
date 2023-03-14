command = ""
command_2 = False
while True:
    command = input("> ").lower()
    if command == "start":
        if command_2:
            print("car is already started ")
        else:
            command_2 = True
            print("car is started ")
    elif command == "stop":
        if not command_2:
            print("car has alreday stopped ")
        else:
            command_2 = False
            print("car is stopped")
    elif command == "help":
        print(
            """
start: to start the car
stop: to stop the car
quit: means exit    
        """
        )

    elif command == "quit":
        break
    else:
        print("error!,couldn't understand it ")
