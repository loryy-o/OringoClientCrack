from flask import Flask, request
import logging
log = logging.getLogger('werkzeug')
log.setLevel(logging.ERROR)

app = Flask("app")

@app.route("/", methods=["GET", "POST"])
def root():
    print("[AUTH] Request recieved, authorizing.")
    print("------- Query Arguments: -------")
    print(request.args.to_dict())
    print("--------------------------------")
    return "1", 200

@app.route("/webhook/u6fP7d7IyDjxcYzJORlFWg==", methods=["GET", "POST"])
def hook():
    print("[HOOK_1] Tried to send data to server, intercepted.")
    print("------- Data: -------")
    print(request.get_data())
    print("---------------------")
    return "1", 200

@app.route("/webhook/2WvCxbXhS+uc36D2ESAnJQ==", methods=["GET", "POST"])
def hook2():
    print("[HOOK_2] Tried to send data to server, intercepted.")
    print("------- Data: -------")
    print(request.get_data())
    print("---------------------")
    return "1", 200


app.run(host='0.0.0.0', port=80)
