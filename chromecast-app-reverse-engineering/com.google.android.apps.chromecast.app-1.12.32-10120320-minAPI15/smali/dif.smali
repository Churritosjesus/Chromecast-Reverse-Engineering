.class public final enum Ldif;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Ldif;

.field public static final enum b:Ldif;

.field public static final enum c:Ldif;

.field public static final enum d:Ldif;

.field private static final synthetic e:[Ldif;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 19
    new-instance v0, Ldif;

    const-string v1, "SPDY_SYN_STREAM"

    invoke-direct {v0, v1, v2}, Ldif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldif;->a:Ldif;

    .line 20
    new-instance v0, Ldif;

    const-string v1, "SPDY_REPLY"

    invoke-direct {v0, v1, v3}, Ldif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldif;->b:Ldif;

    .line 21
    new-instance v0, Ldif;

    const-string v1, "SPDY_HEADERS"

    invoke-direct {v0, v1, v4}, Ldif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldif;->c:Ldif;

    .line 22
    new-instance v0, Ldif;

    const-string v1, "HTTP_20_HEADERS"

    invoke-direct {v0, v1, v5}, Ldif;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldif;->d:Ldif;

    .line 18
    const/4 v0, 0x4

    new-array v0, v0, [Ldif;

    sget-object v1, Ldif;->a:Ldif;

    aput-object v1, v0, v2

    sget-object v1, Ldif;->b:Ldif;

    aput-object v1, v0, v3

    sget-object v1, Ldif;->c:Ldif;

    aput-object v1, v0, v4

    sget-object v1, Ldif;->d:Ldif;

    aput-object v1, v0, v5

    sput-object v0, Ldif;->e:[Ldif;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldif;
    .locals 1

    .prologue
    .line 18
    const-class v0, Ldif;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ldif;

    return-object v0
.end method

.method public static values()[Ldif;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Ldif;->e:[Ldif;

    invoke-virtual {v0}, [Ldif;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldif;

    return-object v0
.end method
