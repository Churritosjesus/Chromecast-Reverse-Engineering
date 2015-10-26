.class public final enum Lbdj;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lbdj;

.field public static final enum b:Lbdj;

.field public static final enum c:Lbdj;

.field public static final enum d:Lbdj;

.field public static final enum e:Lbdj;

.field public static final enum f:Lbdj;

.field public static final enum g:Lbdj;

.field public static final enum h:Lbdj;

.field public static final enum i:Lbdj;

.field public static final enum j:Lbdj;

.field public static final enum k:Lbdj;

.field public static final enum l:Lbdj;

.field public static final enum m:Lbdj;

.field public static final enum n:Lbdj;

.field public static final enum o:Lbdj;

.field public static final enum p:Lbdj;

.field public static final enum q:Lbdj;

.field private static final synthetic s:[Lbdj;


# instance fields
.field public final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/16 v6, 0xb

    const/16 v5, 0xa

    const/4 v4, 0x0

    .line 69
    new-instance v0, Lbdj;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v4, v4}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->a:Lbdj;

    .line 70
    new-instance v0, Lbdj;

    const-string v1, "DISCONNECTED"

    invoke-direct {v0, v1, v7, v5}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->b:Lbdj;

    .line 71
    new-instance v0, Lbdj;

    const-string v1, "DISCONNECTED_EXTERNAL_CLIENT_ACCESSED"

    invoke-direct {v0, v1, v8, v6}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->c:Lbdj;

    .line 72
    new-instance v0, Lbdj;

    const-string v1, "SCANNING"

    const/4 v2, 0x3

    const/16 v3, 0x14

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->d:Lbdj;

    .line 73
    new-instance v0, Lbdj;

    const-string v1, "SCANNING_WRONG_SSID"

    const/4 v2, 0x4

    const/16 v3, 0x15

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->e:Lbdj;

    .line 74
    new-instance v0, Lbdj;

    const-string v1, "BEING_CONFIGURED"

    const/4 v2, 0x5

    const/16 v3, 0x1e

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->f:Lbdj;

    .line 75
    new-instance v0, Lbdj;

    const-string v1, "BEING_CONFIGURED_WRONG_PASSWORD"

    const/4 v2, 0x6

    const/16 v3, 0x1f

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->g:Lbdj;

    .line 76
    new-instance v0, Lbdj;

    const-string v1, "BEING_CONFIGURED_POSSIBLY_WRONG_PASSWORD"

    const/4 v2, 0x7

    const/16 v3, 0x20

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->h:Lbdj;

    .line 77
    new-instance v0, Lbdj;

    const-string v1, "OBTAINING_IP_ADDRESS"

    const/16 v2, 0x8

    const/16 v3, 0x28

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->i:Lbdj;

    .line 78
    new-instance v0, Lbdj;

    const-string v1, "OBTAINING_IP_ADDRESS_BAD_AP"

    const/16 v2, 0x9

    const/16 v3, 0x29

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->j:Lbdj;

    .line 79
    new-instance v0, Lbdj;

    const-string v1, "CHECKING_GLOBAL_CONNECTIVITY"

    const/16 v2, 0x32

    invoke-direct {v0, v1, v5, v2}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->k:Lbdj;

    .line 80
    new-instance v0, Lbdj;

    const-string v1, "CHECKING_GLOBAL_CONNECTIVITY_BAD_ROUTER_WIFI_NOT_SAVED"

    const/16 v2, 0x33

    invoke-direct {v0, v1, v6, v2}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->l:Lbdj;

    .line 81
    new-instance v0, Lbdj;

    const-string v1, "CHECKING_GLOBAL_CONNECTIVITY_BAD_ROUTER"

    const/16 v2, 0xc

    const/16 v3, 0x34

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->m:Lbdj;

    .line 82
    new-instance v0, Lbdj;

    const-string v1, "CONNECTED"

    const/16 v2, 0xd

    const/16 v3, 0x3c

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->n:Lbdj;

    .line 83
    new-instance v0, Lbdj;

    const-string v1, "CONNECTED_NOT_WIFI_SAVED"

    const/16 v2, 0xe

    const/16 v3, 0x3d

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->o:Lbdj;

    .line 84
    new-instance v0, Lbdj;

    const-string v1, "CONNECTED_UPDATE_ONLY"

    const/16 v2, 0xf

    const/16 v3, 0x3e

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->p:Lbdj;

    .line 85
    new-instance v0, Lbdj;

    const-string v1, "CONNECTED_TOS_NOT_ACCEPTED"

    const/16 v2, 0x10

    const/16 v3, 0x3f

    invoke-direct {v0, v1, v2, v3}, Lbdj;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdj;->q:Lbdj;

    .line 68
    const/16 v0, 0x11

    new-array v0, v0, [Lbdj;

    sget-object v1, Lbdj;->a:Lbdj;

    aput-object v1, v0, v4

    sget-object v1, Lbdj;->b:Lbdj;

    aput-object v1, v0, v7

    sget-object v1, Lbdj;->c:Lbdj;

    aput-object v1, v0, v8

    const/4 v1, 0x3

    sget-object v2, Lbdj;->d:Lbdj;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lbdj;->e:Lbdj;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lbdj;->f:Lbdj;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lbdj;->g:Lbdj;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lbdj;->h:Lbdj;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lbdj;->i:Lbdj;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lbdj;->j:Lbdj;

    aput-object v2, v0, v1

    sget-object v1, Lbdj;->k:Lbdj;

    aput-object v1, v0, v5

    sget-object v1, Lbdj;->l:Lbdj;

    aput-object v1, v0, v6

    const/16 v1, 0xc

    sget-object v2, Lbdj;->m:Lbdj;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lbdj;->n:Lbdj;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lbdj;->o:Lbdj;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lbdj;->p:Lbdj;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lbdj;->q:Lbdj;

    aput-object v2, v0, v1

    sput-object v0, Lbdj;->s:[Lbdj;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 90
    iput p3, p0, Lbdj;->r:I

    .line 91
    return-void
.end method

.method public static a(I)Lbdj;
    .locals 5

    .prologue
    .line 94
    invoke-static {}, Lbdj;->values()[Lbdj;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 95
    iget v4, v0, Lbdj;->r:I

    if-ne v4, p0, :cond_0

    .line 99
    :goto_1
    return-object v0

    .line 94
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 99
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lbdj;
    .locals 1

    .prologue
    .line 68
    const-class v0, Lbdj;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbdj;

    return-object v0
.end method

.method public static values()[Lbdj;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lbdj;->s:[Lbdj;

    invoke-virtual {v0}, [Lbdj;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbdj;

    return-object v0
.end method
