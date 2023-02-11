LINUX_VERSION = "5.10"
KBRANCH="feature/xilinx-2021.1-allegro-dvt-upstream-driver"
SRCREV = "da0d17457712d675774db05fef2f0a96292b2616"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
