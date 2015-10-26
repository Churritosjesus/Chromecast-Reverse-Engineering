.class final Lddz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lddm;


# instance fields
.field private a:I

.field private final b:I

.field private synthetic c:Lddy;


# direct methods
.method constructor <init>(Lddy;)V
    .locals 1

    .prologue
    .line 295
    iput-object p1, p0, Lddz;->c:Lddy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 296
    const/4 v0, 0x0

    iput v0, p0, Lddz;->a:I

    .line 297
    invoke-virtual {p1}, Lddy;->b()I

    move-result v0

    iput v0, p0, Lddz;->b:I

    .line 298
    return-void
.end method


# virtual methods
.method public final a()B
    .locals 3

    .prologue
    .line 311
    :try_start_0
    iget-object v0, p0, Lddz;->c:Lddy;

    iget-object v0, v0, Lddy;->b:[B

    iget v1, p0, Lddz;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lddz;->a:I

    aget-byte v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 312
    :catch_0
    move-exception v0

    .line 313
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final hasNext()Z
    .locals 2

    .prologue
    .line 301
    iget v0, p0, Lddz;->a:I

    iget v1, p0, Lddz;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 291
    .line 1306
    invoke-virtual {p0}, Lddz;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    .line 291
    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 318
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
