.class Lddy;
.super Lddl;
.source "PG"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:[B

.field private c:I


# direct methods
.method constructor <init>([B)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lddl;-><init>()V

    .line 222
    const/4 v0, 0x0

    iput v0, p0, Lddy;->c:I

    .line 36
    iput-object p1, p0, Lddy;->b:[B

    .line 37
    return-void
.end method


# virtual methods
.method protected final a(III)I
    .locals 5

    .prologue
    .line 252
    iget-object v2, p0, Lddy;->b:[B

    invoke-virtual {p0}, Lddy;->d()I

    move-result v0

    add-int v1, v0, p2

    move v0, v1

    .line 1256
    :goto_0
    add-int v3, v1, p3

    if-ge v0, v3, :cond_0

    .line 1257
    mul-int/lit8 v3, p1, 0x1f

    aget-byte v4, v2, v0

    add-int p1, v3, v4

    .line 1256
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 252
    :cond_0
    return p1
.end method

.method public a()Lddm;
    .locals 1

    .prologue
    .line 288
    new-instance v0, Lddz;

    .line 1291
    invoke-direct {v0, p0}, Lddz;-><init>(Lddy;)V

    .line 288
    return-object v0
.end method

.method final a(Lddy;II)Z
    .locals 7

    .prologue
    .line 194
    invoke-virtual {p1}, Lddy;->b()I

    move-result v0

    if-le p3, v0, :cond_0

    .line 195
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 196
    invoke-virtual {p0}, Lddy;->b()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x28

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Length too large: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 198
    :cond_0
    add-int v0, p2, p3

    invoke-virtual {p1}, Lddy;->b()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 199
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 201
    invoke-virtual {p1}, Lddy;->b()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x3b

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Ran off end of other: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_1
    iget-object v2, p0, Lddy;->b:[B

    .line 205
    iget-object v3, p1, Lddy;->b:[B

    .line 206
    invoke-virtual {p0}, Lddy;->d()I

    move-result v0

    add-int v4, v0, p3

    .line 207
    invoke-virtual {p0}, Lddy;->d()I

    move-result v1

    .line 208
    invoke-virtual {p1}, Lddy;->d()I

    move-result v0

    add-int/2addr v0, p2

    .line 209
    :goto_0
    if-ge v1, v4, :cond_3

    .line 210
    aget-byte v5, v2, v1

    aget-byte v6, v3, v0

    if-eq v5, v6, :cond_2

    .line 211
    const/4 v0, 0x0

    .line 214
    :goto_1
    return v0

    .line 209
    :cond_2
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 214
    :cond_3
    const/4 v0, 0x1

    goto :goto_1
.end method

.method public b()I
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lddy;->b:[B

    array-length v0, v0

    return v0
.end method

.method protected b([BIII)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lddy;->b:[B

    invoke-static {v0, p2, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    return-void
.end method

.method protected d()I
    .locals 1

    .prologue
    .line 341
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 150
    if-ne p1, p0, :cond_0

    move v0, v1

    .line 176
    :goto_0
    return v0

    .line 153
    :cond_0
    instance-of v0, p1, Lddl;

    if-nez v0, :cond_1

    move v0, v2

    .line 154
    goto :goto_0

    .line 157
    :cond_1
    invoke-virtual {p0}, Lddy;->b()I

    move-result v3

    move-object v0, p1

    check-cast v0, Lddl;

    invoke-virtual {v0}, Lddl;->b()I

    move-result v0

    if-eq v3, v0, :cond_2

    move v0, v2

    .line 158
    goto :goto_0

    .line 160
    :cond_2
    invoke-virtual {p0}, Lddy;->b()I

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    .line 161
    goto :goto_0

    .line 164
    :cond_3
    instance-of v0, p1, Lddy;

    if-eqz v0, :cond_5

    move-object v0, p1

    .line 165
    check-cast v0, Lddy;

    .line 168
    iget v1, p0, Lddy;->c:I

    if-eqz v1, :cond_4

    iget v1, v0, Lddy;->c:I

    if-eqz v1, :cond_4

    iget v1, p0, Lddy;->c:I

    iget v0, v0, Lddy;->c:I

    if-eq v1, v0, :cond_4

    move v0, v2

    .line 171
    goto :goto_0

    .line 174
    :cond_4
    check-cast p1, Lddy;

    invoke-virtual {p0}, Lddy;->b()I

    move-result v0

    invoke-virtual {p0, p1, v2, v0}, Lddy;->a(Lddy;II)Z

    move-result v0

    goto :goto_0

    .line 175
    :cond_5
    instance-of v0, p1, Ldeg;

    if-eqz v0, :cond_6

    .line 176
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 178
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x31

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Has a new type of ByteString been created? Found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 232
    iget v0, p0, Lddy;->c:I

    .line 234
    if-nez v0, :cond_1

    .line 235
    invoke-virtual {p0}, Lddy;->b()I

    move-result v0

    .line 236
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lddy;->a(III)I

    move-result v0

    .line 237
    if-nez v0, :cond_0

    .line 238
    const/4 v0, 0x1

    .line 240
    :cond_0
    iput v0, p0, Lddy;->c:I

    .line 242
    :cond_1
    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0}, Lddy;->a()Lddm;

    move-result-object v0

    return-object v0
.end method
