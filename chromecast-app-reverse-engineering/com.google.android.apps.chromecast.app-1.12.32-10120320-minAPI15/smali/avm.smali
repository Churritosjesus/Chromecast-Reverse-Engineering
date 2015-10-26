.class public final Lavm;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Lauv;

.field final b:Landroid/os/Handler;

.field final c:Ljava/util/UUID;

.field private final d:Lblp;

.field private final e:Ljava/util/UUID;

.field private f:Ljava/lang/StringBuilder;

.field private g:B


# direct methods
.method public constructor <init>(Ljava/util/UUID;Ljava/util/UUID;Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lblp;

    const-string v1, "BlobReader"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lavm;->d:Lblp;

    .line 29
    iput-object p1, p0, Lavm;->e:Ljava/util/UUID;

    .line 30
    iput-object p2, p0, Lavm;->c:Ljava/util/UUID;

    .line 31
    iput-object p3, p0, Lavm;->b:Landroid/os/Handler;

    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lauv;)V
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    iput-byte v0, p0, Lavm;->g:B

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lavm;->f:Ljava/lang/StringBuilder;

    .line 41
    iput-object p1, p0, Lavm;->a:Lauv;

    .line 44
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lavm;->a([B)V

    .line 45
    return-void
.end method

.method a([B)V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/16 v6, 0x200

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 52
    const/4 v0, 0x0

    .line 53
    if-eqz p1, :cond_0

    .line 54
    new-array v0, v4, [Ljava/lang/Object;

    array-length v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v5

    .line 55
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 56
    iget-object v1, p0, Lavm;->f:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    new-array v1, v7, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    aput-object v0, v1, v4

    .line 60
    :cond_0
    if-eqz p1, :cond_1

    if-eqz v0, :cond_2

    array-length v0, p1

    if-ne v0, v6, :cond_2

    .line 1081
    :cond_1
    new-array v0, v4, [B

    iget-byte v1, p0, Lavm;->g:B

    aput-byte v1, v0, v5

    .line 1082
    new-instance v1, Lawi;

    iget-object v2, p0, Lavm;->e:Ljava/util/UUID;

    new-instance v3, Lavn;

    invoke-direct {v3, p0}, Lavn;-><init>(Lavm;)V

    invoke-direct {v1, v2, v3, v0}, Lawi;-><init>(Ljava/util/UUID;Lavv;[B)V

    .line 1095
    iget-byte v0, p0, Lavm;->g:B

    const/16 v2, 0x7f

    if-ne v0, v2, :cond_4

    .line 1097
    iget-object v0, p0, Lavm;->b:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 64
    :cond_2
    :goto_0
    if-eqz p1, :cond_5

    array-length v0, p1

    if-ge v0, v6, :cond_5

    .line 66
    iget-object v0, p0, Lavm;->b:Landroid/os/Handler;

    iget-object v1, p0, Lavm;->f:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 72
    :cond_3
    :goto_1
    new-array v0, v7, [Ljava/lang/Object;

    iget-byte v1, p0, Lavm;->g:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    aput-object v1, v0, v5

    iget-object v1, p0, Lavm;->f:Ljava/lang/StringBuilder;

    aput-object v1, v0, v4

    .line 74
    return-void

    .line 1100
    :cond_4
    iget-byte v0, p0, Lavm;->g:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lavm;->g:B

    .line 1102
    iget-object v0, p0, Lavm;->a:Lauv;

    invoke-virtual {v0, v1}, Lauv;->a(Lavr;)V

    goto :goto_0

    .line 68
    :cond_5
    if-eqz p1, :cond_3

    array-length v0, p1

    if-le v0, v6, :cond_3

    .line 70
    iget-object v0, p0, Lavm;->b:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1
.end method
