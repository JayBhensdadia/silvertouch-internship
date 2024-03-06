import subprocess


shell_command = 'dir'


try:
    subprocess.run(shell_command, shell=True, check=True)
    print("Shell script command executed successfully.")
except subprocess.CalledProcessError:
    print("Error")
