.class public Led;
.super Lep;
.source "PG"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field private d:Lei;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lep;-><init>()V

    .line 55
    return-void
.end method

.method private a()Lei;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Led;->d:Lei;

    if-nez v0, :cond_0

    .line 73
    new-instance v0, Lee;

    invoke-direct {v0, p0}, Lee;-><init>(Led;)V

    iput-object v0, p0, Led;->d:Lei;

    .line 120
    :cond_0
    iget-object v0, p0, Led;->d:Lei;

    return-object v0
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .locals 2

    .prologue
    .line 179
    invoke-direct {p0}, Led;->a()Lei;

    move-result-object v0

    .line 1529
    iget-object v1, v0, Lei;->a:Lek;

    if-nez v1, :cond_0

    .line 1530
    new-instance v1, Lek;

    invoke-direct {v1, v0}, Lek;-><init>(Lei;)V

    iput-object v1, v0, Lei;->a:Lek;

    .line 1532
    :cond_0
    iget-object v0, v0, Lei;->a:Lek;

    .line 179
    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 2

    .prologue
    .line 191
    invoke-direct {p0}, Led;->a()Lei;

    move-result-object v0

    .line 1536
    iget-object v1, v0, Lei;->b:Lel;

    if-nez v1, :cond_0

    .line 1537
    new-instance v1, Lel;

    invoke-direct {v1, v0}, Lel;-><init>(Lei;)V

    iput-object v1, v0, Lei;->b:Lel;

    .line 1539
    :cond_0
    iget-object v0, v0, Lei;->b:Lel;

    .line 191
    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 139
    iget v0, p0, Led;->c:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 1254
    iget-object v1, p0, Lep;->a:[I

    array-length v1, v1

    if-ge v1, v0, :cond_1

    .line 1255
    iget-object v1, p0, Lep;->a:[I

    .line 1256
    iget-object v2, p0, Lep;->b:[Ljava/lang/Object;

    .line 1257
    invoke-super {p0, v0}, Lep;->a(I)V

    .line 1258
    iget v0, p0, Lep;->c:I

    if-lez v0, :cond_0

    .line 1259
    iget-object v0, p0, Lep;->a:[I

    iget v3, p0, Lep;->c:I

    invoke-static {v1, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1260
    iget-object v0, p0, Lep;->b:[Ljava/lang/Object;

    iget v3, p0, Lep;->c:I

    shl-int/lit8 v3, v3, 0x1

    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1262
    :cond_0
    iget v0, p0, Lep;->c:I

    invoke-static {v1, v2, v0}, Lep;->a([I[Ljava/lang/Object;I)V

    .line 140
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 141
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_2
    return-void
.end method

.method public values()Ljava/util/Collection;
    .locals 2

    .prologue
    .line 203
    invoke-direct {p0}, Led;->a()Lei;

    move-result-object v0

    .line 1543
    iget-object v1, v0, Lei;->c:Len;

    if-nez v1, :cond_0

    .line 1544
    new-instance v1, Len;

    invoke-direct {v1, v0}, Len;-><init>(Lei;)V

    iput-object v1, v0, Lei;->c:Len;

    .line 1546
    :cond_0
    iget-object v0, v0, Lei;->c:Len;

    .line 203
    return-object v0
.end method
