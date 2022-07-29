# Oringo Client Universal Crack

## Information
This program allows you to use any version of Oringo Client Supporter without being whitelisted in any way. This will work for any future version unless Oringo decides to change the whitelist method (if he does, I'll promptly update this crack).

## Requirements
- Python >= 3
- Oringo Client Supporter jar (get it yourself lmao)
- 2 iq

## Installation & Usage
- Install the Python dependencies by executing `pip install -r requirements.txt`
- Open a shell with administrator permissions (either Powershell or Command Prompt) and find your loopback internet adapter's IDX (in the first column) with `netsh int ip sh int`
- With that same admin shell, execute `netsh int ip add addr [your loopback adapter's idx] 172.105.246.181/32 st=ac sk=tr`. This will block the server's ip address and redirect it to localhost
- Move the Oringo Client jar to your mods folder
- Run the fake authentication server with `python server.py`
- Run Minecraft

You'll have to run the server (step 6 only) every time you want to play Minecraft with Oringo.

## FAQ
**Q: Does this block the rat?**\
\
A: While it's not really needed as the rat won't work if you appear as whitelisted (and it can't really contact the domain anyways), it does block the rat from sending information over to the server.\
\
**Q: Can i use it with version [insert random version]?**\
\
A: You probably can, but unless it's specifically stated in this README, Oringo might've changed the authentication process, making the crack unusable.\
\

## Supported Versions
- 1.8.1 and previous

## Credits
| Name                 | Reason                       |
|----------------------|------------------------------|
| Me                   | I'm too smart 😎💪          |
| fe                   | Moral support and motivation |
| Anonymous Donator    | Providing me with Oringo jar |
| Pizza Client Discord | Being amazing                |
| Oringo               | Making the client            |
