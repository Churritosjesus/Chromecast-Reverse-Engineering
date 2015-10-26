.class public final enum Laim;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Laim;

.field private static enum b:Laim;

.field private static enum c:Laim;

.field private static enum d:Laim;

.field private static enum e:Laim;

.field private static enum f:Laim;

.field private static enum g:Laim;

.field private static enum h:Laim;

.field private static final synthetic j:[Laim;


# instance fields
.field private final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 92
    new-instance v0, Laim;

    const-string v1, "Login"

    invoke-direct {v0, v1, v4, v4}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->a:Laim;

    .line 93
    new-instance v0, Laim;

    const-string v1, "Share"

    invoke-direct {v0, v1, v5, v5}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->b:Laim;

    .line 94
    new-instance v0, Laim;

    const-string v1, "Message"

    invoke-direct {v0, v1, v6, v6}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->c:Laim;

    .line 95
    new-instance v0, Laim;

    const-string v1, "Like"

    invoke-direct {v0, v1, v7, v7}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->d:Laim;

    .line 96
    new-instance v0, Laim;

    const-string v1, "GameRequest"

    invoke-direct {v0, v1, v8, v8}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->e:Laim;

    .line 97
    new-instance v0, Laim;

    const-string v1, "AppGroupCreate"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->f:Laim;

    .line 98
    new-instance v0, Laim;

    const-string v1, "AppGroupJoin"

    const/4 v2, 0x6

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->g:Laim;

    .line 99
    new-instance v0, Laim;

    const-string v1, "AppInvite"

    const/4 v2, 0x7

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Laim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laim;->h:Laim;

    .line 91
    const/16 v0, 0x8

    new-array v0, v0, [Laim;

    sget-object v1, Laim;->a:Laim;

    aput-object v1, v0, v4

    sget-object v1, Laim;->b:Laim;

    aput-object v1, v0, v5

    sget-object v1, Laim;->c:Laim;

    aput-object v1, v0, v6

    sget-object v1, Laim;->d:Laim;

    aput-object v1, v0, v7

    sget-object v1, Laim;->e:Laim;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Laim;->f:Laim;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Laim;->g:Laim;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Laim;->h:Laim;

    aput-object v2, v0, v1

    sput-object v0, Laim;->j:[Laim;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 104
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 105
    iput p3, p0, Laim;->i:I

    .line 106
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Laim;
    .locals 1

    .prologue
    .line 91
    const-class v0, Laim;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Laim;

    return-object v0
.end method

.method public static values()[Laim;
    .locals 1

    .prologue
    .line 91
    sget-object v0, Laim;->j:[Laim;

    invoke-virtual {v0}, [Laim;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laim;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 109
    invoke-static {}, Lafv;->k()I

    move-result v0

    iget v1, p0, Laim;->i:I

    add-int/2addr v0, v1

    return v0
.end method
