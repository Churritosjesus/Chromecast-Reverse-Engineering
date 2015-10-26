.class public final Lauf;
.super Latt;
.source "PG"


# static fields
.field private static final n:Ljava/lang/String; = "LinkDevice"

.field private static final o:Ljava/lang/String; = "UnlinkDevice"

.field private static q:I

.field private static r:J


# instance fields
.field private final p:Laea;

.field private final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ldcg;Laea;Ladz;)V
    .locals 5

    .prologue
    .line 48
    iget-object v0, p2, Ldcg;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lauf;->n:Ljava/lang/String;

    :goto_0
    const-string v1, "/devices"

    .line 49
    invoke-static {p1, v1}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1096
    invoke-virtual {p2}, Ldcg;->d()I

    move-result v2

    new-array v2, v2, [B

    .line 2075
    const/4 v3, 0x0

    array-length v4, v2

    invoke-static {v2, v3, v4}, Ldep;->a([BII)Ldep;

    move-result-object v3

    .line 1097
    invoke-virtual {p2, v3}, Ldcg;->a(Ldep;)V

    .line 50
    new-instance v3, Laug;

    invoke-direct {v3, p4}, Laug;-><init>(Ladz;)V

    .line 48
    invoke-direct {p0, v0, v1, v2, v3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 60
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Lasr;->a(Landroid/content/Context;)Laec;

    move-result-object v0

    .line 2202
    iput-object v0, p0, Lads;->i:Laec;

    .line 61
    iget-object v0, p2, Ldcg;->b:Ljava/lang/String;

    iput-object v0, p0, Lauf;->s:Ljava/lang/String;

    .line 62
    iput-object p3, p0, Lauf;->p:Laea;

    .line 63
    iget-object v0, p2, Ldcg;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Lauf;->q:I

    .line 64
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sput-wide v0, Lauf;->r:J

    .line 65
    return-void

    .line 48
    :cond_0
    sget-object v0, Lauf;->o:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic a(I)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x1

    invoke-static {v0}, Lauf;->b(I)V

    return-void
.end method

.method private static b(I)V
    .locals 6

    .prologue
    .line 87
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sget-wide v2, Lauf;->r:J

    sub-long v2, v0, v2

    .line 88
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    new-instance v4, Lapd;

    sget v0, Lauf;->q:I

    const/4 v5, 0x1

    if-ne v0, v5, :cond_0

    .line 90
    const/16 v0, 0x4a

    .line 91
    :goto_0
    invoke-direct {v4, v0}, Lapd;-><init>(I)V

    .line 92
    invoke-virtual {v4, p0}, Lapd;->a(I)Lapd;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lapd;->b(J)Lapd;

    move-result-object v0

    .line 88
    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 93
    return-void

    .line 91
    :cond_0
    const/16 v0, 0x51

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    .line 26
    check-cast p1, [B

    .line 3070
    const/4 v0, 0x0

    invoke-static {v0}, Lauf;->b(I)V

    .line 3071
    iget-object v0, p0, Lauf;->p:Laea;

    if-eqz v0, :cond_0

    .line 3072
    const/4 v1, 0x0

    .line 3073
    if-eqz p1, :cond_1

    .line 3149
    :try_start_0
    new-instance v0, Ldch;

    invoke-direct {v0}, Ldch;-><init>()V

    invoke-static {v0, p1}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldch;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 3082
    :goto_0
    iget-object v1, p0, Lauf;->p:Laea;

    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V

    .line 26
    :cond_0
    return-void

    .line 3076
    :catch_0
    move-exception v0

    move-object v2, v0

    .line 3077
    const-string v3, "LinkDevice"

    sget v0, Lauf;->q:I

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    .line 3078
    const-string v0, "LinkDevice"

    .line 3079
    :goto_1
    invoke-virtual {v2}, Ldev;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x32

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Could not load devices association response for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ": "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3077
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    move-object v0, v1

    goto :goto_0

    .line 3078
    :cond_2
    const-string v0, "UnlinkDevice"

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    .prologue
    .line 103
    sget v0, Lauf;->q:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin https://www.googleapis.com/auth/grants.audit"

    goto :goto_0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lauf;->s:Ljava/lang/String;

    return-object v0
.end method
