DESCRIPTION = "RPi.GPIO wrapper for WiringPi"
HOMEPAGE = "https://github.com/phylax2020/RPi.GPIO"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83f7f092235b06523efa5da59e89440d"

inherit setuptools3

DEPENDS += "wiringpi"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/phylax2020/RPi.GPIO.git;branch=main;protocol=https"
SRCREV = "9fab4cf21b56aad8123ebdad7482aa24ddb2c58f"
