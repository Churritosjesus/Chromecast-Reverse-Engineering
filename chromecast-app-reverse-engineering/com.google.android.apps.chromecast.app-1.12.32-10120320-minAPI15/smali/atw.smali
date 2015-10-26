.class public final Latw;
.super Laun;
.source "PG"


# instance fields
.field public final a:Ljava/util/List;

.field public b:Z

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Laun;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Latw;->a:Ljava/util/List;

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Latw;->b:Z

    .line 40
    invoke-static {p1}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Latw;->c:Ljava/lang/String;

    .line 41
    return-void
.end method

.method static synthetic a(Latw;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Latw;->b:Z

    return v0
.end method

.method static synthetic a(Latw;Z)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Latw;->b:Z

    return v0
.end method

.method static synthetic b(Latw;)Ljava/util/List;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Latw;->a:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 125
    :try_start_0
    new-instance v3, Ldbs;

    invoke-direct {v3}, Ldbs;-><init>()V

    .line 126
    iget-object v0, p0, Latw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ldbr;

    iput-object v0, v3, Ldbs;->a:[Ldbr;

    move v1, v2

    .line 127
    :goto_0
    iget-object v0, p0, Latw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 128
    iget-object v4, v3, Ldbs;->a:[Ldbr;

    iget-object v0, p0, Latw;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    .line 1087
    new-instance v5, Ldbr;

    invoke-direct {v5}, Ldbr;-><init>()V

    .line 1088
    iget-object v6, v0, Last;->a:Ljava/lang/String;

    iput-object v6, v5, Ldbr;->a:Ljava/lang/String;

    .line 1089
    iget-object v6, v0, Last;->b:Ljava/lang/String;

    iput-object v6, v5, Ldbr;->b:Ljava/lang/String;

    .line 1090
    iget-object v6, v0, Last;->c:Ljava/lang/String;

    iput-object v6, v5, Ldbr;->c:Ljava/lang/String;

    .line 1091
    iget-wide v6, v0, Last;->d:J

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-lez v6, :cond_0

    .line 1092
    iget-wide v6, v0, Last;->d:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v5, Ldbr;->d:Ljava/lang/Long;

    .line 128
    :cond_0
    aput-object v5, v4, v1

    .line 127
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {v3}, Ldbs;->d()I

    move-result v0

    new-array v0, v0, [B

    .line 2075
    const/4 v1, 0x0

    array-length v4, v0

    invoke-static {v0, v1, v4}, Ldep;->a([BII)Ldep;

    move-result-object v1

    .line 131
    invoke-virtual {v3, v1}, Ldbs;->a(Ldep;)V

    .line 132
    const-string v1, "user_devices"

    const/4 v3, 0x0

    .line 133
    invoke-static {v0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 132
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    :goto_1
    return-void

    .line 134
    :catch_0
    move-exception v0

    .line 135
    iget-object v1, p0, Latw;->h:Lblp;

    const-string v3, "Could not serialize device data for savedInstanceState: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v2

    invoke-virtual {v1, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public final a(Latf;Lauo;)V
    .locals 4

    .prologue
    .line 67
    new-instance v0, Lauk;

    iget-object v1, p0, Latw;->c:Ljava/lang/String;

    new-instance v2, Latx;

    invoke-direct {v2, p0, p2}, Latx;-><init>(Latw;Lauo;)V

    new-instance v3, Laty;

    invoke-direct {v3, p0, p2}, Laty;-><init>(Latw;Lauo;)V

    invoke-direct {v0, v1, v2, v3}, Lauk;-><init>(Ljava/lang/String;Laea;Ladz;)V

    invoke-virtual {p1, v0}, Latf;->a(Latb;)V

    .line 106
    return-void
.end method

.method public final a(Ldbs;)V
    .locals 3

    .prologue
    .line 113
    iget-object v0, p0, Latw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 114
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Ldbs;->a:[Ldbr;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 115
    new-instance v1, Last;

    iget-object v2, p1, Ldbs;->a:[Ldbr;

    aget-object v2, v2, v0

    invoke-direct {v1, v2}, Last;-><init>(Ldbr;)V

    .line 117
    iget-object v2, p0, Latw;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 119
    :cond_0
    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 141
    const-string v0, "user_devices"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_0

    .line 144
    const/4 v1, 0x0

    .line 146
    :try_start_0
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 145
    invoke-static {v0}, Ldbs;->a([B)Ldbs;

    move-result-object v0

    .line 147
    invoke-virtual {p0, v0}, Latw;->a(Ldbs;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    :cond_0
    :goto_0
    new-array v0, v5, [Ljava/lang/Object;

    .line 3044
    iget-object v1, p0, Latw;->a:Ljava/util/List;

    .line 152
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    .line 153
    return-void

    .line 148
    :catch_0
    move-exception v0

    .line 149
    iget-object v1, p0, Latw;->h:Lblp;

    const-string v2, "Could not load user device list from savedInstanceState: %s"

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
