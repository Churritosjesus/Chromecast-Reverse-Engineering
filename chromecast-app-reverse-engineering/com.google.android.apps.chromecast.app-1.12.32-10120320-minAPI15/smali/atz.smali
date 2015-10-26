.class public final Latz;
.super Laun;
.source "PG"


# instance fields
.field public a:Lauq;

.field public b:Laur;

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Laun;-><init>()V

    .line 30
    invoke-static {p1}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Latz;->j:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Latz;->i:Ljava/lang/String;

    .line 33
    new-instance v0, Lauq;

    invoke-direct {v0}, Lauq;-><init>()V

    iput-object v0, p0, Latz;->a:Lauq;

    .line 34
    new-instance v0, Laur;

    invoke-direct {v0}, Laur;-><init>()V

    iput-object v0, p0, Latz;->b:Laur;

    .line 35
    return-void
.end method

.method static synthetic a(Latz;J)J
    .locals 1

    .prologue
    .line 19
    iput-wide p1, p0, Latz;->c:J

    return-wide p1
.end method

.method static synthetic a(Latz;Lauq;)Lauq;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Latz;->a:Lauq;

    return-object p1
.end method

.method static synthetic a(Latz;Laur;)Laur;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Latz;->b:Laur;

    return-object p1
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 124
    iget-object v1, p0, Latz;->a:Lauq;

    .line 1104
    :try_start_0
    invoke-virtual {v1}, Lauq;->a()Ldck;

    move-result-object v0

    .line 1105
    invoke-virtual {v0}, Ldck;->d()I

    move-result v2

    new-array v2, v2, [B

    .line 2075
    const/4 v3, 0x0

    array-length v4, v2

    invoke-static {v2, v3, v4}, Ldep;->a([BII)Ldep;

    move-result-object v3

    .line 1106
    invoke-virtual {v0, v3}, Ldck;->a(Ldep;)V

    .line 1107
    const-string v0, "user_topic_settings"

    const/4 v3, 0x0

    .line 1108
    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    .line 1107
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    :goto_0
    iget-object v1, p0, Latz;->b:Laur;

    .line 4037
    iget-object v0, v1, Laur;->b:Ldcj;

    .line 3041
    if-eqz v0, :cond_0

    .line 5037
    :try_start_1
    iget-object v0, v1, Laur;->b:Ldcj;

    .line 3046
    invoke-virtual {v0}, Ldcj;->d()I

    move-result v0

    new-array v0, v0, [B

    .line 6037
    iget-object v2, v1, Laur;->b:Ldcj;

    .line 6075
    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v0, v3, v4}, Ldep;->a([BII)Ldep;

    move-result-object v3

    .line 3047
    invoke-virtual {v2, v3}, Ldcj;->a(Ldep;)V

    .line 3048
    const-string v2, "user_setting_metadata"

    const/4 v3, 0x0

    .line 3049
    invoke-static {v0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 3048
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3052
    :cond_0
    :goto_1
    return-void

    .line 1109
    :catch_0
    move-exception v0

    .line 1110
    iget-object v1, v1, Lauq;->a:Lblp;

    const-string v2, "Could not serialize settings data for savedInstanceState: %s"

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 3050
    :catch_1
    move-exception v0

    .line 3051
    iget-object v1, v1, Laur;->a:Lblp;

    const-string v2, "Could not serialize backdrop meta data for savedInstanceState: %s"

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public final a(Latf;Lauo;)V
    .locals 10

    .prologue
    .line 40
    new-instance v1, Laue;

    iget-object v2, p0, Latz;->j:Ljava/lang/String;

    iget-object v3, p0, Latz;->i:Ljava/lang/String;

    iget-wide v4, p0, Latz;->c:J

    iget-object v6, p0, Latz;->d:Ljava/lang/String;

    iget-object v7, p0, Latz;->e:Ljava/lang/String;

    new-instance v8, Laua;

    invoke-direct {v8, p0, p2}, Laua;-><init>(Latz;Lauo;)V

    new-instance v9, Laub;

    invoke-direct {v9, p0, p2}, Laub;-><init>(Latz;Lauo;)V

    invoke-direct/range {v1 .. v9}, Laue;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Laea;Ladz;)V

    invoke-virtual {p1, v1}, Latf;->a(Latb;)V

    .line 76
    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 130
    iget-object v1, p0, Latz;->a:Lauq;

    .line 6116
    const-string v0, "user_topic_settings"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6117
    if-eqz v0, :cond_0

    .line 6119
    const/4 v2, 0x0

    .line 6120
    :try_start_0
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 7106
    new-instance v2, Ldck;

    invoke-direct {v2}, Ldck;-><init>()V

    invoke-static {v2, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldck;

    .line 6119
    invoke-virtual {v1, v0}, Lauq;->a(Ldck;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :cond_0
    :goto_0
    iget-object v1, p0, Latz;->b:Laur;

    .line 8057
    const-string v0, "user_setting_metadata"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8058
    if-eqz v0, :cond_1

    .line 8060
    const/4 v2, 0x0

    .line 8061
    :try_start_1
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {v0}, Ldcj;->a([B)Ldcj;

    move-result-object v0

    .line 9033
    iput-object v0, v1, Laur;->b:Ldcj;
    :try_end_1
    .catch Ldev; {:try_start_1 .. :try_end_1} :catch_1

    .line 8064
    :cond_1
    :goto_1
    return-void

    .line 6121
    :catch_0
    move-exception v0

    .line 6122
    iget-object v1, v1, Lauq;->a:Lblp;

    const-string v2, "Could not load user topic settings from savedInstanceState: %s"

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 8062
    :catch_1
    move-exception v0

    .line 8063
    iget-object v1, v1, Laur;->a:Lblp;

    const-string v2, "Could not load backdrop meta data from savedInstanceState: %s"

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public final b(Latf;Lauo;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 84
    invoke-virtual {p0}, Latz;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 85
    if-eqz p2, :cond_0

    .line 86
    invoke-interface {p2, v8}, Lauo;->a(Z)V

    .line 120
    :cond_0
    :goto_0
    return-void

    .line 94
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Latz;->a()J

    move-result-wide v6

    .line 95
    new-instance v0, Laum;

    iget-object v1, p0, Latz;->j:Ljava/lang/String;

    iget-object v2, p0, Latz;->i:Ljava/lang/String;

    iget-object v3, p0, Latz;->a:Lauq;

    .line 98
    invoke-virtual {v3}, Lauq;->a()Ldck;

    move-result-object v3

    new-instance v4, Lauc;

    invoke-direct {v4, p0, v6, v7, p2}, Lauc;-><init>(Latz;JLauo;)V

    new-instance v5, Laud;

    invoke-direct {v5, p0, p2}, Laud;-><init>(Latz;Lauo;)V

    invoke-direct/range {v0 .. v5}, Laum;-><init>(Ljava/lang/String;Ljava/lang/String;Ldck;Laea;Ladz;)V

    .line 95
    invoke-virtual {p1, v0}, Latf;->a(Latb;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 117
    :catch_0
    move-exception v0

    .line 118
    iget-object v1, p0, Latz;->h:Lblp;

    const-string v2, "Could not serialize DeviceBackdropSettings data: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v8

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
