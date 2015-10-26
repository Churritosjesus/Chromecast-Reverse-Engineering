.class public final enum Lbdl;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lbdl;

.field private static enum c:Lbdl;

.field private static enum d:Lbdl;

.field private static enum e:Lbdl;

.field private static enum f:Lbdl;

.field private static enum g:Lbdl;

.field private static enum h:Lbdl;

.field private static enum i:Lbdl;

.field private static enum j:Lbdl;

.field private static enum k:Lbdl;

.field private static enum l:Lbdl;

.field private static final synthetic m:[Lbdl;


# instance fields
.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 39
    new-instance v0, Lbdl;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v4, v4}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->a:Lbdl;

    .line 40
    new-instance v0, Lbdl;

    const-string v1, "DISCONNECTED"

    invoke-direct {v0, v1, v5, v5}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->c:Lbdl;

    .line 41
    new-instance v0, Lbdl;

    const-string v1, "INTERFACE_DISABLED"

    invoke-direct {v0, v1, v6, v6}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->d:Lbdl;

    .line 42
    new-instance v0, Lbdl;

    const-string v1, "INACTIVE"

    invoke-direct {v0, v1, v7, v7}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->e:Lbdl;

    .line 43
    new-instance v0, Lbdl;

    const-string v1, "SCANNING"

    invoke-direct {v0, v1, v8, v8}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->f:Lbdl;

    .line 44
    new-instance v0, Lbdl;

    const-string v1, "AUTHENTICATING"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->g:Lbdl;

    .line 45
    new-instance v0, Lbdl;

    const-string v1, "ASSOCIATING"

    const/4 v2, 0x6

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->h:Lbdl;

    .line 46
    new-instance v0, Lbdl;

    const-string v1, "ASSOCIATED"

    const/4 v2, 0x7

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->i:Lbdl;

    .line 47
    new-instance v0, Lbdl;

    const-string v1, "FOUR_WAY_HANDSHAKE"

    const/16 v2, 0x8

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->j:Lbdl;

    .line 48
    new-instance v0, Lbdl;

    const-string v1, "GROUP_HANDSHAKE"

    const/16 v2, 0x9

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->k:Lbdl;

    .line 49
    new-instance v0, Lbdl;

    const-string v1, "COMPLETED"

    const/16 v2, 0xa

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lbdl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbdl;->l:Lbdl;

    .line 38
    const/16 v0, 0xb

    new-array v0, v0, [Lbdl;

    sget-object v1, Lbdl;->a:Lbdl;

    aput-object v1, v0, v4

    sget-object v1, Lbdl;->c:Lbdl;

    aput-object v1, v0, v5

    sget-object v1, Lbdl;->d:Lbdl;

    aput-object v1, v0, v6

    sget-object v1, Lbdl;->e:Lbdl;

    aput-object v1, v0, v7

    sget-object v1, Lbdl;->f:Lbdl;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lbdl;->g:Lbdl;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lbdl;->h:Lbdl;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lbdl;->i:Lbdl;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lbdl;->j:Lbdl;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lbdl;->k:Lbdl;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lbdl;->l:Lbdl;

    aput-object v2, v0, v1

    sput-object v0, Lbdl;->m:[Lbdl;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 54
    iput p3, p0, Lbdl;->b:I

    .line 55
    return-void
.end method

.method public static a(I)Lbdl;
    .locals 5

    .prologue
    .line 58
    invoke-static {}, Lbdl;->values()[Lbdl;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 59
    iget v4, v0, Lbdl;->b:I

    if-ne v4, p0, :cond_0

    .line 63
    :goto_1
    return-object v0

    .line 58
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 63
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lbdl;
    .locals 1

    .prologue
    .line 38
    const-class v0, Lbdl;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbdl;

    return-object v0
.end method

.method public static values()[Lbdl;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lbdl;->m:[Lbdl;

    invoke-virtual {v0}, [Lbdl;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbdl;

    return-object v0
.end method
