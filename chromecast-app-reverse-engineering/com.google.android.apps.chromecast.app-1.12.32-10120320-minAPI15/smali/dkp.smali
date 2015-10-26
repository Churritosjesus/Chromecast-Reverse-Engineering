.class final Ldkp;
.super Ljava/io/OutputStream;
.source "PG"


# instance fields
.field private synthetic a:Ldko;


# direct methods
.method constructor <init>(Ldko;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Ldkp;->a:Ldko;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Ldkp;->a:Ldko;

    invoke-virtual {v0}, Ldko;->close()V

    .line 210
    return-void
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Ldkp;->a:Ldko;

    .line 3023
    iget-boolean v0, v0, Ldko;->b:Z

    .line 203
    if-nez v0, :cond_0

    .line 204
    iget-object v0, p0, Ldkp;->a:Ldko;

    invoke-virtual {v0}, Ldko;->flush()V

    .line 206
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ldkp;->a:Ldko;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".outputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(I)V
    .locals 2

    .prologue
    .line 190
    iget-object v0, p0, Ldkp;->a:Ldko;

    .line 1023
    iget-boolean v0, v0, Ldko;->b:Z

    .line 190
    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_0
    iget-object v0, p0, Ldkp;->a:Ldko;

    iget-object v0, v0, Ldko;->a:Ldjz;

    int-to-byte v1, p1

    invoke-virtual {v0, v1}, Ldjz;->b(I)Ldjz;

    .line 192
    iget-object v0, p0, Ldkp;->a:Ldko;

    invoke-virtual {v0}, Ldko;->r()Ldkc;

    .line 193
    return-void
.end method

.method public final write([BII)V
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Ldkp;->a:Ldko;

    .line 2023
    iget-boolean v0, v0, Ldko;->b:Z

    .line 196
    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 197
    :cond_0
    iget-object v0, p0, Ldkp;->a:Ldko;

    iget-object v0, v0, Ldko;->a:Ldjz;

    invoke-virtual {v0, p1, p2, p3}, Ldjz;->b([BII)Ldjz;

    .line 198
    iget-object v0, p0, Ldkp;->a:Ldko;

    invoke-virtual {v0}, Ldko;->r()Ldkc;

    .line 199
    return-void
.end method
