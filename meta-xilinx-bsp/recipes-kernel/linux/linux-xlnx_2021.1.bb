LINUX_VERSION = "5.10"
KBRANCH="feature/xilinx-2021.1-allegro-dvt-upstream-driver"
SRCREV = "95c1f01ba4f67d1cdaccfacfc6789060fdee704c"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
