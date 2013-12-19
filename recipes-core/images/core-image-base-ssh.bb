DESCRIPTION = "A console-only image that fully supports the target device \
hardware and runs an openssh server."

IMAGE_FEATURES += "splash ssh-server-openssh package-management"

LICENSE = "MIT"

inherit core-image
