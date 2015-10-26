.class public final enum Lbsq;
.super Ljava/lang/Enum;


# static fields
.field private static enum A:Lbsq;

.field private static enum B:Lbsq;

.field private static enum C:Lbsq;

.field private static enum D:Lbsq;

.field private static enum E:Lbsq;

.field private static enum F:Lbsq;

.field private static enum G:Lbsq;

.field private static enum H:Lbsq;

.field private static enum I:Lbsq;

.field private static enum J:Lbsq;

.field private static enum K:Lbsq;

.field private static enum L:Lbsq;

.field private static enum M:Lbsq;

.field private static enum N:Lbsq;

.field private static enum O:Lbsq;

.field private static enum P:Lbsq;

.field private static enum Q:Lbsq;

.field private static enum R:Lbsq;

.field private static enum S:Lbsq;

.field private static enum T:Lbsq;

.field private static enum U:Lbsq;

.field private static enum V:Lbsq;

.field private static enum W:Lbsq;

.field private static final synthetic X:[Lbsq;

.field public static final enum a:Lbsq;

.field public static final enum b:Lbsq;

.field public static final enum c:Lbsq;

.field public static final enum d:Lbsq;

.field public static final enum e:Lbsq;

.field public static final enum f:Lbsq;

.field public static final enum g:Lbsq;

.field private static enum i:Lbsq;

.field private static enum j:Lbsq;

.field private static enum k:Lbsq;

.field private static enum l:Lbsq;

.field private static enum m:Lbsq;

.field private static enum n:Lbsq;

.field private static enum o:Lbsq;

.field private static enum p:Lbsq;

.field private static enum q:Lbsq;

.field private static enum r:Lbsq;

.field private static enum s:Lbsq;

.field private static enum t:Lbsq;

.field private static enum u:Lbsq;

.field private static enum v:Lbsq;

.field private static enum w:Lbsq;

.field private static enum x:Lbsq;

.field private static enum y:Lbsq;

.field private static enum z:Lbsq;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    new-instance v0, Lbsq;

    const-string v1, "SUCCESS"

    const-string v2, "Ok"

    invoke-direct {v0, v1, v4, v2}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->i:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "BAD_AUTHENTICATION"

    const-string v2, "BadAuthentication"

    invoke-direct {v0, v1, v5, v2}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->j:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "EMPTY_CONSUMER_PKG_OR_SIG"

    const-string v2, "EmptyConsumerPackageOrSig"

    invoke-direct {v0, v1, v6, v2}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->k:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NEEDS_2F"

    const-string v2, "InvalidSecondFactor"

    invoke-direct {v0, v1, v7, v2}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->l:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NEEDS_POST_SIGN_IN_FLOW"

    const-string v2, "PostSignInFlowRequired"

    invoke-direct {v0, v1, v8, v2}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->m:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NOT_VERIFIED"

    const/4 v2, 0x5

    const-string v3, "NotVerified"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->n:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "TERMS_NOT_AGREED"

    const/4 v2, 0x6

    const-string v3, "TermsNotAgreed"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->o:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x7

    const-string v3, "Unknown"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->p:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "UNKNOWN_ERROR"

    const/16 v2, 0x8

    const-string v3, "UNKNOWN_ERR"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->q:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "ACCOUNT_DELETED"

    const/16 v2, 0x9

    const-string v3, "AccountDeleted"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->r:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "ACCOUNT_DISABLED"

    const/16 v2, 0xa

    const-string v3, "AccountDisabled"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->s:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "SERVICE_DISABLED"

    const/16 v2, 0xb

    const-string v3, "ServiceDisabled"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->t:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "SERVICE_UNAVAILABLE"

    const/16 v2, 0xc

    const-string v3, "ServiceUnavailable"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->u:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "CAPTCHA"

    const/16 v2, 0xd

    const-string v3, "CaptchaRequired"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->v:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NETWORK_ERROR"

    const/16 v2, 0xe

    const-string v3, "NetworkError"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->w:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "USER_CANCEL"

    const/16 v2, 0xf

    const-string v3, "UserCancel"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->x:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "PERMISSION_DENIED"

    const/16 v2, 0x10

    const-string v3, "PermissionDenied"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->y:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DEVICE_MANAGEMENT_REQUIRED"

    const/16 v2, 0x11

    const-string v3, "DeviceManagementRequiredOrSyncDisabled"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->z:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED"

    const/16 v2, 0x12

    const-string v3, "ThirdPartyDeviceManagementRequired"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->a:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DM_INTERNAL_ERROR"

    const/16 v2, 0x13

    const-string v3, "DeviceManagementInternalError"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->A:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DM_SYNC_DISABLED"

    const/16 v2, 0x14

    const-string v3, "DeviceManagementSyncDisabled"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->b:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DM_ADMIN_BLOCKED"

    const/16 v2, 0x15

    const-string v3, "DeviceManagementAdminBlocked"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->c:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DM_ADMIN_PENDING_APPROVAL"

    const/16 v2, 0x16

    const-string v3, "DeviceManagementAdminPendingApproval"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->d:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DM_STALE_SYNC_REQUIRED"

    const/16 v2, 0x17

    const-string v3, "DeviceManagementStaleSyncRequired"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->e:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DM_DEACTIVATED"

    const/16 v2, 0x18

    const-string v3, "DeviceManagementDeactivated"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->f:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DM_REQUIRED"

    const/16 v2, 0x19

    const-string v3, "DeviceManagementRequired"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->g:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "CLIENT_LOGIN_DISABLED"

    const/16 v2, 0x1a

    const-string v3, "ClientLoginDisabled"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->B:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NEED_PERMISSION"

    const/16 v2, 0x1b

    const-string v3, "NeedPermission"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->C:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "BAD_PASSWORD"

    const/16 v2, 0x1c

    const-string v3, "WeakPassword"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->D:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "ALREADY_HAS_GMAIL"

    const/16 v2, 0x1d

    const-string v3, "ALREADY_HAS_GMAIL"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->E:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "BAD_REQUEST"

    const/16 v2, 0x1e

    const-string v3, "BadRequest"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->F:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "BAD_USERNAME"

    const/16 v2, 0x1f

    const-string v3, "BadUsername"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->G:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "LOGIN_FAIL"

    const/16 v2, 0x20

    const-string v3, "LoginFail"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->H:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NOT_LOGGED_IN"

    const/16 v2, 0x21

    const-string v3, "NotLoggedIn"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->I:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NO_GMAIL"

    const/16 v2, 0x22

    const-string v3, "NoGmail"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->J:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "REQUEST_DENIED"

    const/16 v2, 0x23

    const-string v3, "RequestDenied"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->K:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "SERVER_ERROR"

    const/16 v2, 0x24

    const-string v3, "ServerError"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->L:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "USERNAME_UNAVAILABLE"

    const/16 v2, 0x25

    const-string v3, "UsernameUnavailable"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->M:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "DELETED_GMAIL"

    const/16 v2, 0x26

    const-string v3, "DeletedGmail"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->N:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "SOCKET_TIMEOUT"

    const/16 v2, 0x27

    const-string v3, "SocketTimeout"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->O:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "EXISTING_USERNAME"

    const/16 v2, 0x28

    const-string v3, "ExistingUsername"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->P:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "NEEDS_BROWSER"

    const/16 v2, 0x29

    const-string v3, "NeedsBrowser"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->Q:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "GPLUS_OTHER"

    const/16 v2, 0x2a

    const-string v3, "GPlusOther"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->R:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "GPLUS_NICKNAME"

    const/16 v2, 0x2b

    const-string v3, "GPlusNickname"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->S:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "GPLUS_INVALID_CHAR"

    const/16 v2, 0x2c

    const-string v3, "GPlusInvalidChar"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->T:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "GPLUS_INTERSTITIAL"

    const/16 v2, 0x2d

    const-string v3, "GPlusInterstitial"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->U:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "GPLUS_PROFILE_ERROR"

    const/16 v2, 0x2e

    const-string v3, "ProfileUpgradeError"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->V:Lbsq;

    new-instance v0, Lbsq;

    const-string v1, "INVALID_SCOPE"

    const/16 v2, 0x2f

    const-string v3, "INVALID_SCOPE"

    invoke-direct {v0, v1, v2, v3}, Lbsq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbsq;->W:Lbsq;

    const/16 v0, 0x30

    new-array v0, v0, [Lbsq;

    sget-object v1, Lbsq;->i:Lbsq;

    aput-object v1, v0, v4

    sget-object v1, Lbsq;->j:Lbsq;

    aput-object v1, v0, v5

    sget-object v1, Lbsq;->k:Lbsq;

    aput-object v1, v0, v6

    sget-object v1, Lbsq;->l:Lbsq;

    aput-object v1, v0, v7

    sget-object v1, Lbsq;->m:Lbsq;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lbsq;->n:Lbsq;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lbsq;->o:Lbsq;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lbsq;->p:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lbsq;->q:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lbsq;->r:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lbsq;->s:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lbsq;->t:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lbsq;->u:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lbsq;->v:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lbsq;->w:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lbsq;->x:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lbsq;->y:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lbsq;->z:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lbsq;->a:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lbsq;->A:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lbsq;->b:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lbsq;->c:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lbsq;->d:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lbsq;->e:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lbsq;->f:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lbsq;->g:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lbsq;->B:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lbsq;->C:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lbsq;->D:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lbsq;->E:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lbsq;->F:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    sget-object v2, Lbsq;->G:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x20

    sget-object v2, Lbsq;->H:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x21

    sget-object v2, Lbsq;->I:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x22

    sget-object v2, Lbsq;->J:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x23

    sget-object v2, Lbsq;->K:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x24

    sget-object v2, Lbsq;->L:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x25

    sget-object v2, Lbsq;->M:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x26

    sget-object v2, Lbsq;->N:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x27

    sget-object v2, Lbsq;->O:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x28

    sget-object v2, Lbsq;->P:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x29

    sget-object v2, Lbsq;->Q:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x2a

    sget-object v2, Lbsq;->R:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x2b

    sget-object v2, Lbsq;->S:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x2c

    sget-object v2, Lbsq;->T:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x2d

    sget-object v2, Lbsq;->U:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x2e

    sget-object v2, Lbsq;->V:Lbsq;

    aput-object v2, v0, v1

    const/16 v1, 0x2f

    sget-object v2, Lbsq;->W:Lbsq;

    aput-object v2, v0, v1

    sput-object v0, Lbsq;->X:[Lbsq;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbsq;->h:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbsq;
    .locals 1

    const-class v0, Lbsq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbsq;

    return-object v0
.end method

.method public static values()[Lbsq;
    .locals 1

    sget-object v0, Lbsq;->X:[Lbsq;

    invoke-virtual {v0}, [Lbsq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbsq;

    return-object v0
.end method
