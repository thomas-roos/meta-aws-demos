SUMMARY = "Adafruit-Blinka-Raspberry-Pi5-Neopixel"
HOMEPAGE = "https://github.com/adafruit/Adafruit_Blinka_Raspberry_Pi5_Neopixel.git"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/adafruit/Adafruit_Blinka_Raspberry_Pi5_Neopixel.git;branch=main;protocol=https"
SRCREV = "d23379a86fef8ad3a8e6442aac9f7f57108c60c2"

S = "${WORKDIR}/git"

inherit python3native setuptools3

DEPENDS += "python3-pybind11-native"

RDEPENDS:${PN} += " \
    python-adafruit-circuitpython-pixelbuf \
    rpi-gpio \
"