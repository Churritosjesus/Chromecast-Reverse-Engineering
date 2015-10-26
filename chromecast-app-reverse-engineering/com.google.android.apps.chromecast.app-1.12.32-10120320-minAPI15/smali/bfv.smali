.class public final enum Lbfv;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lbfv;

.field private static enum c:Lbfv;

.field private static enum d:Lbfv;

.field private static enum e:Lbfv;

.field private static enum f:Lbfv;

.field private static enum g:Lbfv;

.field private static final synthetic h:[Lbfv;


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

    .line 77
    new-instance v0, Lbfv;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v4, v4}, Lbfv;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbfv;->a:Lbfv;

    .line 78
    new-instance v0, Lbfv;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v5, v5}, Lbfv;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbfv;->c:Lbfv;

    .line 79
    new-instance v0, Lbfv;

    const-string v1, "WEP"

    invoke-direct {v0, v1, v6, v6}, Lbfv;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbfv;->d:Lbfv;

    .line 80
    new-instance v0, Lbfv;

    const-string v1, "TKIP"

    invoke-direct {v0, v1, v7, v7}, Lbfv;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbfv;->e:Lbfv;

    .line 81
    new-instance v0, Lbfv;

    const-string v1, "CCMP"

    invoke-direct {v0, v1, v8, v8}, Lbfv;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbfv;->f:Lbfv;

    .line 82
    new-instance v0, Lbfv;

    const-string v1, "AES"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lbfv;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbfv;->g:Lbfv;

    .line 76
    const/4 v0, 0x6

    new-array v0, v0, [Lbfv;

    sget-object v1, Lbfv;->a:Lbfv;

    aput-object v1, v0, v4

    sget-object v1, Lbfv;->c:Lbfv;

    aput-object v1, v0, v5

    sget-object v1, Lbfv;->d:Lbfv;

    aput-object v1, v0, v6

    sget-object v1, Lbfv;->e:Lbfv;

    aput-object v1, v0, v7

    sget-object v1, Lbfv;->f:Lbfv;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lbfv;->g:Lbfv;

    aput-object v2, v0, v1

    sput-object v0, Lbfv;->h:[Lbfv;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 87
    iput p3, p0, Lbfv;->b:I

    .line 88
    return-void
.end method

.method public static a(I)Lbfv;
    .locals 5

    .prologue
    .line 91
    invoke-static {}, Lbfv;->values()[Lbfv;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 92
    iget v4, v0, Lbfv;->b:I

    if-ne v4, p0, :cond_0

    .line 94
    :goto_1
    return-object v0

    .line 91
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 94
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lbfv;
    .locals 1

    .prologue
    .line 76
    const-class v0, Lbfv;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbfv;

    return-object v0
.end method

.method public static values()[Lbfv;
    .locals 1

    .prologue
    .line 76
    sget-object v0, Lbfv;->h:[Lbfv;

    invoke-virtual {v0}, [Lbfv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbfv;

    return-object v0
.end method
