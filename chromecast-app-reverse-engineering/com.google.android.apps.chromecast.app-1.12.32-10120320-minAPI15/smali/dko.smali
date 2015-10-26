.class final Ldko;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldkc;


# instance fields
.field public final a:Ldjz;

.field b:Z

.field private c:Ldku;


# direct methods
.method public constructor <init>(Ldku;)V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Ldjz;

    invoke-direct {v0}, Ldjz;-><init>()V

    invoke-direct {p0, p1, v0}, Ldko;-><init>(Ldku;Ldjz;)V

    .line 36
    return-void
.end method

.method private constructor <init>(Ldku;Ldjz;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sink == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_0
    iput-object p2, p0, Ldko;->a:Ldjz;

    .line 31
    iput-object p1, p0, Ldko;->c:Ldku;

    .line 32
    return-void
.end method


# virtual methods
.method public final a(Ldkv;)J
    .locals 6

    .prologue
    .line 100
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_0
    const-wide/16 v0, 0x0

    .line 102
    :goto_0
    iget-object v2, p0, Ldko;->a:Ldjz;

    const-wide/16 v4, 0x800

    invoke-interface {p1, v2, v4, v5}, Ldkv;->a(Ldjz;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    .line 103
    add-long/2addr v0, v2

    .line 104
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    goto :goto_0

    .line 106
    :cond_1
    return-wide v0
.end method

.method public final a()Ldkw;
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Ldko;->c:Ldku;

    invoke-interface {v0}, Ldku;->a()Ldkw;

    move-result-object v0

    return-object v0
.end method

.method public final a_(Ldjz;J)V
    .locals 2

    .prologue
    .line 44
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1, p2, p3}, Ldjz;->a_(Ldjz;J)V

    .line 46
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    .line 47
    return-void
.end method

.method public final b()Ldjz;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Ldko;->a:Ldjz;

    return-object v0
.end method

.method public final b(Ldke;)Ldkc;
    .locals 2

    .prologue
    .line 50
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1}, Ldjz;->a(Ldke;)Ldjz;

    .line 52
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ldkc;
    .locals 2

    .prologue
    .line 56
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1}, Ldjz;->a(Ljava/lang/String;)Ldjz;

    .line 58
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final b([B)Ldkc;
    .locals 2

    .prologue
    .line 88
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1}, Ldjz;->a([B)Ldjz;

    .line 90
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final c([BII)Ldkc;
    .locals 2

    .prologue
    .line 94
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1, p2, p3}, Ldjz;->b([BII)Ldjz;

    .line 96
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 188
    new-instance v0, Ldkp;

    invoke-direct {v0, p0}, Ldkp;-><init>(Ldko;)V

    return-object v0
.end method

.method public final close()V
    .locals 6

    .prologue
    .line 227
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_1

    .line 248
    :cond_0
    :goto_0
    return-void

    .line 231
    :cond_1
    const/4 v0, 0x0

    .line 233
    :try_start_0
    iget-object v1, p0, Ldko;->a:Ldjz;

    iget-wide v2, v1, Ldjz;->b:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_2

    .line 234
    iget-object v1, p0, Ldko;->c:Ldku;

    iget-object v2, p0, Ldko;->a:Ldjz;

    iget-object v3, p0, Ldko;->a:Ldjz;

    iget-wide v4, v3, Ldjz;->b:J

    invoke-interface {v1, v2, v4, v5}, Ldku;->a_(Ldjz;J)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 241
    :cond_2
    :goto_1
    :try_start_1
    iget-object v1, p0, Ldko;->c:Ldku;

    invoke-interface {v1}, Ldku;->close()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 245
    :cond_3
    :goto_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Ldko;->b:Z

    .line 247
    if-eqz v0, :cond_0

    invoke-static {v0}, Ldky;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 242
    :catch_0
    move-exception v1

    .line 243
    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_2

    .line 236
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public final d()Ldkc;
    .locals 4

    .prologue
    .line 181
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 182
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    .line 2060
    iget-wide v0, v0, Ldjz;->b:J

    .line 183
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    iget-object v2, p0, Ldko;->c:Ldku;

    iget-object v3, p0, Ldko;->a:Ldjz;

    invoke-interface {v2, v3, v0, v1}, Ldku;->a_(Ldjz;J)V

    .line 184
    :cond_1
    return-object p0
.end method

.method public final f(I)Ldkc;
    .locals 2

    .prologue
    .line 138
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1}, Ldjz;->d(I)Ldjz;

    .line 140
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final flush()V
    .locals 4

    .prologue
    .line 219
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    iget-wide v0, v0, Ldjz;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 221
    iget-object v0, p0, Ldko;->c:Ldku;

    iget-object v1, p0, Ldko;->a:Ldjz;

    iget-object v2, p0, Ldko;->a:Ldjz;

    iget-wide v2, v2, Ldjz;->b:J

    invoke-interface {v0, v1, v2, v3}, Ldku;->a_(Ldjz;J)V

    .line 223
    :cond_1
    iget-object v0, p0, Ldko;->c:Ldku;

    invoke-interface {v0}, Ldku;->flush()V

    .line 224
    return-void
.end method

.method public final g(I)Ldkc;
    .locals 2

    .prologue
    .line 126
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 127
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1}, Ldjz;->c(I)Ldjz;

    .line 128
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final h(I)Ldkc;
    .locals 2

    .prologue
    .line 120
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1}, Ldjz;->b(I)Ldjz;

    .line 122
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final h(J)Ldkc;
    .locals 3

    .prologue
    .line 168
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 169
    :cond_0
    iget-object v0, p0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1, p2}, Ldjz;->g(J)Ldjz;

    .line 170
    invoke-virtual {p0}, Ldko;->r()Ldkc;

    move-result-object v0

    return-object v0
.end method

.method public final r()Ldkc;
    .locals 7

    .prologue
    const-wide/16 v2, 0x0

    .line 174
    iget-boolean v0, p0, Ldko;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 175
    :cond_0
    iget-object v4, p0, Ldko;->a:Ldjz;

    .line 1260
    iget-wide v0, v4, Ldjz;->b:J

    .line 1261
    cmp-long v5, v0, v2

    if-nez v5, :cond_3

    move-wide v0, v2

    .line 176
    :cond_1
    :goto_0
    cmp-long v2, v0, v2

    if-lez v2, :cond_2

    iget-object v2, p0, Ldko;->c:Ldku;

    iget-object v3, p0, Ldko;->a:Ldjz;

    invoke-interface {v2, v3, v0, v1}, Ldku;->a_(Ldjz;J)V

    .line 177
    :cond_2
    return-object p0

    .line 1264
    :cond_3
    iget-object v4, v4, Ldjz;->a:Ldks;

    iget-object v4, v4, Ldks;->g:Ldks;

    .line 1265
    iget v5, v4, Ldks;->c:I

    const/16 v6, 0x800

    if-ge v5, v6, :cond_1

    iget-boolean v5, v4, Ldks;->e:Z

    if-eqz v5, :cond_1

    .line 1266
    iget v5, v4, Ldks;->c:I

    iget v4, v4, Ldks;->b:I

    sub-int v4, v5, v4

    int-to-long v4, v4

    sub-long/2addr v0, v4

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldko;->c:Ldku;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
