# LINUX_VERSION = "5.10"
# KBRANCH="xlnx_rebase_v5.10"
# SRCREV = "09a4215f61493584f4410cab3477003e4046dab9"

# KCONF_AUDIT_LEVEL="0"

# include linux-xlnx.inc

# FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


LINUX_VERSION = "5.15.19"
KBRANCH="xlnx_rebase_v5.15_LTS_2022.1_update"
SRCREV = "75872fda9ad270b611ee6ae2433492da1e22b688"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"