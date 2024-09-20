SRCBRANCH ?= "2024"
SRCREV = "10ee5a2b99e5fa16fd6bf4fe675822238d9c9fc3"
BRANCH = "xlnx_rel_v2024.1"
LIC_FILES_CHKSUM ?= "file://LICENSE.md;md5=f4d5df0f12dcea1b1a0124219c0dbab4"
PV .= "+git"

REPO = "git://github.com/Xilinx/libmetal.git;protocol=https"

include ${LAYER_PATH_openamp-layer}/recipes-openamp/libmetal/libmetal.inc
include ${LAYER_PATH_openamp-layer}/vendor/xilinx/recipes-openamp/libmetal/libmetal-xlnx.inc

RPROVIDES:${PN}-dbg += "libmetal-dbg"
RPROVIDES:${PN}-dev += "libmetal-dev"
RPROVIDES:${PN}-lic += "libmetal-lic"
RPROVIDES:${PN}-src += "libmetal-src"
RPROVIDES:${PN}-staticdev += "libmetal-staticdev"
