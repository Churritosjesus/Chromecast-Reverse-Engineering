.class public final enum Lbrw;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lbrw;

.field private static enum b:Lbrw;

.field private static final synthetic c:[Lbrw;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lbrw;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lbrw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbrw;->b:Lbrw;

    new-instance v0, Lbrw;

    const-string v1, "GZIP"

    invoke-direct {v0, v1, v3}, Lbrw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbrw;->a:Lbrw;

    const/4 v0, 0x2

    new-array v0, v0, [Lbrw;

    sget-object v1, Lbrw;->b:Lbrw;

    aput-object v1, v0, v2

    sget-object v1, Lbrw;->a:Lbrw;

    aput-object v1, v0, v3

    sput-object v0, Lbrw;->c:[Lbrw;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lbrw;
    .locals 1

    const-string v0, "GZIP"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lbrw;->a:Lbrw;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lbrw;->b:Lbrw;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lbrw;
    .locals 1

    const-class v0, Lbrw;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbrw;

    return-object v0
.end method

.method public static values()[Lbrw;
    .locals 1

    sget-object v0, Lbrw;->c:[Lbrw;

    invoke-virtual {v0}, [Lbrw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbrw;

    return-object v0
.end method
