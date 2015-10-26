.class public final enum Lbfu;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lbfu;

.field public static final enum b:Lbfu;

.field public static final enum c:Lbfu;

.field public static final enum d:Lbfu;

.field public static final enum e:Lbfu;

.field public static final enum f:Lbfu;

.field public static final enum g:Lbfu;

.field public static final enum h:Lbfu;

.field public static final enum i:Lbfu;

.field private static final synthetic l:[Lbfu;


# instance fields
.field public final j:I

.field public final k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 49
    new-instance v0, Lbfu;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v5, v5, v5}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->a:Lbfu;

    .line 50
    new-instance v0, Lbfu;

    const-string v1, "NONE_OPEN"

    invoke-direct {v0, v1, v4, v4, v5}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->b:Lbfu;

    .line 51
    new-instance v0, Lbfu;

    const-string v1, "NONE_WEP"

    invoke-direct {v0, v1, v6, v6, v4}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->c:Lbfu;

    .line 52
    new-instance v0, Lbfu;

    const-string v1, "NONE_WEP_SHARED"

    invoke-direct {v0, v1, v7, v7, v4}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->d:Lbfu;

    .line 53
    new-instance v0, Lbfu;

    const-string v1, "IEEE_8021X"

    invoke-direct {v0, v1, v8, v8, v5}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->e:Lbfu;

    .line 54
    new-instance v0, Lbfu;

    const-string v1, "WPA_PSK"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3, v4}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->f:Lbfu;

    .line 55
    new-instance v0, Lbfu;

    const-string v1, "WPA_EAP"

    const/4 v2, 0x6

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3, v4}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->g:Lbfu;

    .line 56
    new-instance v0, Lbfu;

    const-string v1, "WPA2_PSK"

    const/4 v2, 0x7

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3, v4}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->h:Lbfu;

    .line 57
    new-instance v0, Lbfu;

    const-string v1, "WPA2_EAP"

    const/16 v2, 0x8

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3, v4}, Lbfu;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lbfu;->i:Lbfu;

    .line 48
    const/16 v0, 0x9

    new-array v0, v0, [Lbfu;

    sget-object v1, Lbfu;->a:Lbfu;

    aput-object v1, v0, v5

    sget-object v1, Lbfu;->b:Lbfu;

    aput-object v1, v0, v4

    sget-object v1, Lbfu;->c:Lbfu;

    aput-object v1, v0, v6

    sget-object v1, Lbfu;->d:Lbfu;

    aput-object v1, v0, v7

    sget-object v1, Lbfu;->e:Lbfu;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lbfu;->f:Lbfu;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lbfu;->g:Lbfu;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lbfu;->h:Lbfu;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lbfu;->i:Lbfu;

    aput-object v2, v0, v1

    sput-object v0, Lbfu;->l:[Lbfu;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIZ)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 64
    iput p3, p0, Lbfu;->j:I

    .line 65
    iput-boolean p4, p0, Lbfu;->k:Z

    .line 66
    return-void
.end method

.method public static a(I)Lbfu;
    .locals 5

    .prologue
    .line 69
    invoke-static {}, Lbfu;->values()[Lbfu;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 70
    iget v4, v0, Lbfu;->j:I

    if-ne v4, p0, :cond_0

    .line 72
    :goto_1
    return-object v0

    .line 69
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 72
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lbfu;
    .locals 1

    .prologue
    .line 48
    const-class v0, Lbfu;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbfu;

    return-object v0
.end method

.method public static values()[Lbfu;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lbfu;->l:[Lbfu;

    invoke-virtual {v0}, [Lbfu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbfu;

    return-object v0
.end method
