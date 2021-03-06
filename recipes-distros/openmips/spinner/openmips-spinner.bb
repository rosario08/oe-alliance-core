DESCRIPTION = "openmips-spinner"
MAINTAINER = "openMIPS Team"
SECTION = "base"
LICENSE = "proprietary"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

PV = "1.0"
PR = "r1"

SRC_URI="file://wait1.png \
		file://wait2.png \
		file://wait3.png \
		file://wait4.png \
		file://wait5.png \
		file://wait6.png \
		file://wait7.png \
		"
		
S = "${WORKDIR}"		

do_install() {
	install -d ${D}${datadir}/enigma2/skin_default/spinner
	install -m 0644 ${S}/*.png ${D}${datadir}/enigma2/skin_default/spinner
}

FILES_${PN} = "${datadir}/enigma2"
