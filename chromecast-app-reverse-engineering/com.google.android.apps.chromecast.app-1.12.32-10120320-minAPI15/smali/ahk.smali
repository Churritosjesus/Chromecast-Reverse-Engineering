.class final Lahk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lafb;)V
    .locals 2

    .prologue
    .line 200
    .line 1172
    iget-object v0, p1, Lafb;->d:Ljava/lang/String;

    .line 200
    invoke-static {}, Lafv;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lahk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    invoke-static {p1}, Laji;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    const/4 p1, 0x0

    .line 206
    :cond_0
    iput-object p1, p0, Lahk;->a:Ljava/lang/String;

    .line 207
    iput-object p2, p0, Lahk;->b:Ljava/lang/String;

    .line 208
    return-void
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 250
    new-instance v0, Lahl;

    iget-object v1, p0, Lahk;->a:Ljava/lang/String;

    iget-object v2, p0, Lahk;->b:Ljava/lang/String;

    .line 1234
    invoke-direct {v0, v1, v2}, Lahl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 226
    instance-of v1, p1, Lahk;

    if-nez v1, :cond_1

    .line 231
    :cond_0
    :goto_0
    return v0

    .line 229
    :cond_1
    check-cast p1, Lahk;

    .line 230
    iget-object v1, p1, Lahk;->a:Ljava/lang/String;

    iget-object v2, p0, Lahk;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Laji;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lahk;->b:Ljava/lang/String;

    iget-object v2, p0, Lahk;->b:Ljava/lang/String;

    .line 231
    invoke-static {v1, v2}, Laji;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 220
    iget-object v0, p0, Lahk;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lahk;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 221
    :goto_1
    xor-int/2addr v0, v1

    return v0

    .line 220
    :cond_0
    iget-object v0, p0, Lahk;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    .line 221
    :cond_1
    iget-object v1, p0, Lahk;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1
.end method
