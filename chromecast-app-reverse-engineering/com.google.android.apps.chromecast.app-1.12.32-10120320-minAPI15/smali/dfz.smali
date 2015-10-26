.class public final Ldfz;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Ldfq;

.field b:Ljava/lang/String;

.field c:Ldfp;

.field d:Ldga;

.field e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    const-string v0, "GET"

    iput-object v0, p0, Ldfz;->b:Ljava/lang/String;

    .line 129
    new-instance v0, Ldfp;

    invoke-direct {v0}, Ldfp;-><init>()V

    iput-object v0, p0, Ldfz;->c:Ldfp;

    .line 130
    return-void
.end method

.method constructor <init>(Ldfy;)V
    .locals 1

    .prologue
    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1028
    iget-object v0, p1, Ldfy;->a:Ldfq;

    .line 133
    iput-object v0, p0, Ldfz;->a:Ldfq;

    .line 2028
    iget-object v0, p1, Ldfy;->b:Ljava/lang/String;

    .line 134
    iput-object v0, p0, Ldfz;->b:Ljava/lang/String;

    .line 3028
    iget-object v0, p1, Ldfy;->d:Ldga;

    .line 135
    iput-object v0, p0, Ldfz;->d:Ldga;

    .line 4028
    iget-object v0, p1, Ldfy;->e:Ljava/lang/Object;

    .line 136
    iput-object v0, p0, Ldfz;->e:Ljava/lang/Object;

    .line 5028
    iget-object v0, p1, Ldfy;->c:Ldfo;

    .line 137
    invoke-virtual {v0}, Ldfo;->a()Ldfp;

    move-result-object v0

    iput-object v0, p0, Ldfz;->c:Ldfp;

    .line 138
    return-void
.end method


# virtual methods
.method public final a()Ldfy;
    .locals 2

    .prologue
    .line 262
    iget-object v0, p0, Ldfz;->a:Ldfq;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_0
    new-instance v0, Ldfy;

    .line 6028
    invoke-direct {v0, p0}, Ldfy;-><init>(Ldfz;)V

    .line 263
    return-object v0
.end method

.method public final a(Ljava/lang/String;)Ldfz;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Ldfz;->c:Ldfp;

    invoke-virtual {v0, p1}, Ldfp;->a(Ljava/lang/String;)Ldfp;

    .line 188
    return-object p0
.end method

.method public final a(Ljava/lang/String;Ldga;)Ldfz;
    .locals 3

    .prologue
    .line 237
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 238
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "method == null || method.length() == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_1
    if-eqz p2, :cond_2

    invoke-static {p1}, La;->q(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 241
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "method "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must not have a request body."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :cond_2
    if-nez p2, :cond_3

    invoke-static {p1}, La;->p(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 244
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "method "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must have a request body."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_3
    iput-object p1, p0, Ldfz;->b:Ljava/lang/String;

    .line 247
    iput-object p2, p0, Ldfz;->d:Ldga;

    .line 248
    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ldfz;
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Ldfz;->c:Ldfp;

    invoke-virtual {v0, p1, p2}, Ldfp;->c(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 174
    return-object p0
.end method

.method public final a(Ljava/net/URL;)Ldfz;
    .locals 3

    .prologue
    .line 162
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_0
    invoke-static {p1}, Ldfq;->a(Ljava/net/URL;)Ldfq;

    move-result-object v0

    .line 164
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected url: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5141
    :cond_1
    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5142
    :cond_2
    iput-object v0, p0, Ldfz;->a:Ldfq;

    .line 165
    return-object p0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ldfz;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Ldfz;->c:Ldfp;

    invoke-virtual {v0, p1, p2}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 183
    return-object p0
.end method
