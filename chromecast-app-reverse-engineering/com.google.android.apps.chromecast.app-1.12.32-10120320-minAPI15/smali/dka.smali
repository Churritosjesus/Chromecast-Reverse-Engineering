.class final Ldka;
.super Ljava/io/OutputStream;
.source "PG"


# instance fields
.field private synthetic a:Ldjz;


# direct methods
.method constructor <init>(Ldjz;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Ldka;->a:Ldjz;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .prologue
    .line 81
    return-void
.end method

.method public final flush()V
    .locals 0

    .prologue
    .line 78
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    .line 70
    iget-object v0, p0, Ldka;->a:Ldjz;

    int-to-byte v1, p1

    invoke-virtual {v0, v1}, Ldjz;->b(I)Ldjz;

    .line 71
    return-void
.end method

.method public final write([BII)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Ldka;->a:Ldjz;

    invoke-virtual {v0, p1, p2, p3}, Ldjz;->b([BII)Ldjz;

    .line 75
    return-void
.end method
