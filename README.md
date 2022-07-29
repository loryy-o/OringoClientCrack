# Oringo Client Universal Crack

## Information
This program allows you to use any version of Oringo Client Supporter without being whitelisted in any way. This will work for any future version unless Oringo decides to change the whitelist method (if he does, i'll promptly update this crack).

## Requirements
- Python >= 3
- Oringo Client Supporter jar (Get it yourself lmao retard)
- 2 IQ

## Installation & Usage
- Clone this repository
- Install the Python dependencies by executing `pip install -r requirements.txt`
- Open a shell with administrator permissions (either powershell or cmd) and find your loopback internet adapter's IDX (in the first column) with `netsh int ip sh int`
- With that same admin shell, execute `netsh int ip add addr [your loopback adapter's idx] 172.105.246.181/32 st=ac sk=tr`. This will block the server's ip address and redirect it to localhost
- Move the Oringo Client jar to your mods folder
- run the fake authentication server from my repository with `python server.py`
- Run Minecraft

You'll have to run the server (step 6 only) every time you want to play Minecraft with Oringo Client Supporter.

## FAQ
**Q: Does this block the rat?**\
\
A: While it's not really needed as the rat won't work if you appear as whitelisted (and it can't really contact the domain anyways), it does block the rat from sending information over to the server.\
\
**Q: Can i use it with version [insert random version]?**\
\
A: You probably can, but unless it's specifically stated in this README, Oringo might've changed the authentication process, making the crack unusable.\
\
**Q: Why?**\
\
A: 'Cause fuck Oringo

## Supported Versions
- 1.8.1 and previous
