.class public final Ldaq;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ldbj;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:[Ldar;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 192
    invoke-direct {p0}, Ldew;-><init>()V

    .line 193
    iput-object v0, p0, Ldaq;->a:Ldbj;

    .line 194
    iput-object v0, p0, Ldaq;->b:Ljava/lang/String;

    .line 195
    iput-object v0, p0, Ldaq;->c:Ljava/lang/String;

    .line 196
    iput-object v0, p0, Ldaq;->d:Ljava/lang/Boolean;

    .line 197
    iput-object v0, p0, Ldaq;->e:Ljava/lang/String;

    .line 198
    iput-object v0, p0, Ldaq;->f:Ljava/lang/String;

    .line 199
    iput-object v0, p0, Ldaq;->g:Ljava/lang/String;

    .line 200
    invoke-static {}, Ldar;->b()[Ldar;

    move-result-object v0

    iput-object v0, p0, Ldaq;->h:[Ldar;

    .line 201
    const/4 v0, -0x1

    iput v0, p0, Ldaq;->t:I

    .line 202
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    .line 241
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 242
    iget-object v1, p0, Ldaq;->a:Ldbj;

    if-eqz v1, :cond_0

    .line 243
    const/4 v1, 0x1

    iget-object v2, p0, Ldaq;->a:Ldbj;

    .line 244
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 246
    :cond_0
    iget-object v1, p0, Ldaq;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 247
    const/4 v1, 0x2

    iget-object v2, p0, Ldaq;->b:Ljava/lang/String;

    .line 248
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 250
    :cond_1
    iget-object v1, p0, Ldaq;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 251
    const/4 v1, 0x3

    iget-object v2, p0, Ldaq;->c:Ljava/lang/String;

    .line 252
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 254
    :cond_2
    iget-object v1, p0, Ldaq;->e:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 255
    const/4 v1, 0x4

    iget-object v2, p0, Ldaq;->e:Ljava/lang/String;

    .line 256
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 258
    :cond_3
    iget-object v1, p0, Ldaq;->f:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 259
    const/4 v1, 0x5

    iget-object v2, p0, Ldaq;->f:Ljava/lang/String;

    .line 260
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 262
    :cond_4
    iget-object v1, p0, Ldaq;->h:[Ldar;

    if-eqz v1, :cond_7

    iget-object v1, p0, Ldaq;->h:[Ldar;

    array-length v1, v1

    if-lez v1, :cond_7

    .line 263
    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Ldaq;->h:[Ldar;

    array-length v2, v2

    if-ge v0, v2, :cond_6

    .line 264
    iget-object v2, p0, Ldaq;->h:[Ldar;

    aget-object v2, v2, v0

    .line 265
    if-eqz v2, :cond_5

    .line 266
    const/4 v3, 0x6

    .line 267
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 263
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    move v0, v1

    .line 271
    :cond_7
    iget-object v1, p0, Ldaq;->d:Ljava/lang/Boolean;

    if-eqz v1, :cond_8

    .line 272
    const/4 v1, 0x7

    iget-object v2, p0, Ldaq;->d:Ljava/lang/Boolean;

    .line 273
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1620
    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 273
    add-int/2addr v0, v1

    .line 275
    :cond_8
    iget-object v1, p0, Ldaq;->g:Ljava/lang/String;

    if-eqz v1, :cond_9

    .line 276
    const/16 v1, 0x8

    iget-object v2, p0, Ldaq;->g:Ljava/lang/String;

    .line 277
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 279
    :cond_9
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 2287
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 2288
    sparse-switch v0, :sswitch_data_0

    .line 2292
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2293
    :sswitch_0
    return-object p0

    .line 2298
    :sswitch_1
    iget-object v0, p0, Ldaq;->a:Ldbj;

    if-nez v0, :cond_1

    .line 2299
    new-instance v0, Ldbj;

    invoke-direct {v0}, Ldbj;-><init>()V

    iput-object v0, p0, Ldaq;->a:Ldbj;

    .line 2301
    :cond_1
    iget-object v0, p0, Ldaq;->a:Ldbj;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 2305
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldaq;->b:Ljava/lang/String;

    goto :goto_0

    .line 2309
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldaq;->c:Ljava/lang/String;

    goto :goto_0

    .line 2313
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldaq;->e:Ljava/lang/String;

    goto :goto_0

    .line 2317
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldaq;->f:Ljava/lang/String;

    goto :goto_0

    .line 2321
    :sswitch_6
    const/16 v0, 0x32

    .line 2322
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 2323
    iget-object v0, p0, Ldaq;->h:[Ldar;

    if-nez v0, :cond_3

    move v0, v1

    .line 2324
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldar;

    .line 2326
    if-eqz v0, :cond_2

    .line 2327
    iget-object v3, p0, Ldaq;->h:[Ldar;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2329
    :cond_2
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_4

    .line 2330
    new-instance v3, Ldar;

    invoke-direct {v3}, Ldar;-><init>()V

    aput-object v3, v2, v0

    .line 2331
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 2332
    invoke-virtual {p1}, Ldeo;->a()I

    .line 2329
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2323
    :cond_3
    iget-object v0, p0, Ldaq;->h:[Ldar;

    array-length v0, v0

    goto :goto_1

    .line 2335
    :cond_4
    new-instance v3, Ldar;

    invoke-direct {v3}, Ldar;-><init>()V

    aput-object v3, v2, v0

    .line 2336
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 2337
    iput-object v2, p0, Ldaq;->h:[Ldar;

    goto :goto_0

    .line 2341
    :sswitch_7
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldaq;->d:Ljava/lang/Boolean;

    goto/16 :goto_0

    .line 2345
    :sswitch_8
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldaq;->g:Ljava/lang/String;

    goto/16 :goto_0

    .line 2288
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
        0x38 -> :sswitch_7
        0x42 -> :sswitch_8
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 207
    iget-object v0, p0, Ldaq;->a:Ldbj;

    if-eqz v0, :cond_0

    .line 208
    const/4 v0, 0x1

    iget-object v1, p0, Ldaq;->a:Ldbj;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 210
    :cond_0
    iget-object v0, p0, Ldaq;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 211
    const/4 v0, 0x2

    iget-object v1, p0, Ldaq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 213
    :cond_1
    iget-object v0, p0, Ldaq;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 214
    const/4 v0, 0x3

    iget-object v1, p0, Ldaq;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 216
    :cond_2
    iget-object v0, p0, Ldaq;->e:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 217
    const/4 v0, 0x4

    iget-object v1, p0, Ldaq;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 219
    :cond_3
    iget-object v0, p0, Ldaq;->f:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 220
    const/4 v0, 0x5

    iget-object v1, p0, Ldaq;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 222
    :cond_4
    iget-object v0, p0, Ldaq;->h:[Ldar;

    if-eqz v0, :cond_6

    iget-object v0, p0, Ldaq;->h:[Ldar;

    array-length v0, v0

    if-lez v0, :cond_6

    .line 223
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldaq;->h:[Ldar;

    array-length v1, v1

    if-ge v0, v1, :cond_6

    .line 224
    iget-object v1, p0, Ldaq;->h:[Ldar;

    aget-object v1, v1, v0

    .line 225
    if-eqz v1, :cond_5

    .line 226
    const/4 v2, 0x6

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 223
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 230
    :cond_6
    iget-object v0, p0, Ldaq;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    .line 231
    const/4 v0, 0x7

    iget-object v1, p0, Ldaq;->d:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(IZ)V

    .line 233
    :cond_7
    iget-object v0, p0, Ldaq;->g:Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 234
    const/16 v0, 0x8

    iget-object v1, p0, Ldaq;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 236
    :cond_8
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 237
    return-void
.end method
