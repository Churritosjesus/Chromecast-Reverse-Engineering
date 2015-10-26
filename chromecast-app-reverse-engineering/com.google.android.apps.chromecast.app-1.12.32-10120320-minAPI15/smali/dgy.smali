.class abstract Ldgy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldkv;


# instance fields
.field public a:Z

.field private b:Ldkh;

.field private synthetic c:Ldgx;


# direct methods
.method private constructor <init>(Ldgx;)V
    .locals 2

    .prologue
    .line 357
    iput-object p1, p0, Ldgy;->c:Ldgx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    new-instance v0, Ldkh;

    iget-object v1, p0, Ldgy;->c:Ldgx;

    .line 1063
    iget-object v1, v1, Ldgx;->c:Ldkd;

    .line 358
    invoke-interface {v1}, Ldkd;->a()Ldkw;

    move-result-object v1

    invoke-direct {v0, v1}, Ldkh;-><init>(Ldkw;)V

    iput-object v0, p0, Ldgy;->b:Ldkh;

    return-void
.end method

.method synthetic constructor <init>(Ldgx;B)V
    .locals 0

    .prologue
    .line 357
    invoke-direct {p0, p1}, Ldgy;-><init>(Ldgx;)V

    return-void
.end method


# virtual methods
.method public final a()Ldkw;
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Ldgy;->b:Ldkh;

    return-object v0
.end method

.method protected final a(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 370
    iget-object v0, p0, Ldgy;->c:Ldgx;

    .line 2063
    iget v0, v0, Ldgx;->e:I

    .line 370
    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldgy;->c:Ldgx;

    .line 3063
    iget v2, v2, Ldgx;->e:I

    .line 370
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 372
    :cond_0
    iget-object v0, p0, Ldgy;->c:Ldgx;

    iget-object v1, p0, Ldgy;->b:Ldkh;

    invoke-static {v0, v1}, Ldgx;->a(Ldgx;Ldkh;)V

    .line 374
    iget-object v0, p0, Ldgy;->c:Ldgx;

    .line 4063
    iput v2, v0, Ldgx;->e:I

    .line 375
    if-eqz p1, :cond_2

    iget-object v0, p0, Ldgy;->c:Ldgx;

    .line 5063
    iget v0, v0, Ldgx;->f:I

    .line 375
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 376
    iget-object v0, p0, Ldgy;->c:Ldgx;

    .line 6063
    iput v2, v0, Ldgx;->f:I

    .line 377
    sget-object v0, Ldgi;->b:Ldgi;

    iget-object v1, p0, Ldgy;->c:Ldgx;

    .line 7063
    iget-object v1, v1, Ldgx;->a:Ldfi;

    .line 377
    iget-object v2, p0, Ldgy;->c:Ldgx;

    .line 8063
    iget-object v2, v2, Ldgx;->b:Ldfh;

    .line 377
    invoke-virtual {v0, v1, v2}, Ldgi;->a(Ldfi;Ldfh;)V

    .line 382
    :cond_1
    :goto_0
    return-void

    .line 378
    :cond_2
    iget-object v0, p0, Ldgy;->c:Ldgx;

    .line 9063
    iget v0, v0, Ldgx;->f:I

    .line 378
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 379
    iget-object v0, p0, Ldgy;->c:Ldgx;

    const/4 v1, 0x6

    .line 10063
    iput v1, v0, Ldgx;->e:I

    .line 380
    iget-object v0, p0, Ldgy;->c:Ldgx;

    .line 11063
    iget-object v0, v0, Ldgx;->b:Ldfh;

    .line 11211
    iget-object v0, v0, Ldfh;->c:Ljava/net/Socket;

    .line 380
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    goto :goto_0
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 397
    iget-object v0, p0, Ldgy;->c:Ldgx;

    .line 12063
    iget-object v0, v0, Ldgx;->b:Ldfh;

    .line 12211
    iget-object v0, v0, Ldfh;->c:Ljava/net/Socket;

    .line 397
    invoke-static {v0}, Ldgs;->a(Ljava/net/Socket;)V

    .line 398
    iget-object v0, p0, Ldgy;->c:Ldgx;

    const/4 v1, 0x6

    .line 13063
    iput v1, v0, Ldgx;->e:I

    .line 399
    return-void
.end method
