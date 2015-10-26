.class public final Ldaz;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/Boolean;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/Boolean;

.field public d:[Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:[Ldba;

.field private g:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 183
    invoke-direct {p0}, Ldew;-><init>()V

    .line 184
    iput-object v1, p0, Ldaz;->a:Ljava/lang/Boolean;

    .line 185
    iput-object v1, p0, Ldaz;->b:Ljava/lang/Boolean;

    .line 186
    iput-object v1, p0, Ldaz;->c:Ljava/lang/Boolean;

    .line 187
    iput-object v1, p0, Ldaz;->g:Ljava/lang/Boolean;

    .line 188
    sget-object v0, Ldey;->b:[Ljava/lang/String;

    iput-object v0, p0, Ldaz;->d:[Ljava/lang/String;

    .line 189
    iput-object v1, p0, Ldaz;->e:Ljava/lang/String;

    .line 190
    invoke-static {}, Ldba;->b()[Ldba;

    move-result-object v0

    iput-object v0, p0, Ldaz;->f:[Ldba;

    .line 191
    const/4 v0, -0x1

    iput v0, p0, Ldaz;->t:I

    .line 192
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 233
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 234
    iget-object v2, p0, Ldaz;->a:Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    .line 235
    const/4 v2, 0x1

    iget-object v3, p0, Ldaz;->a:Ljava/lang/Boolean;

    .line 236
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1620
    invoke-static {v2}, Ldep;->b(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 236
    add-int/2addr v0, v2

    .line 238
    :cond_0
    iget-object v2, p0, Ldaz;->b:Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    .line 239
    const/4 v2, 0x2

    iget-object v3, p0, Ldaz;->b:Ljava/lang/Boolean;

    .line 240
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2620
    invoke-static {v2}, Ldep;->b(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 240
    add-int/2addr v0, v2

    .line 242
    :cond_1
    iget-object v2, p0, Ldaz;->f:[Ldba;

    if-eqz v2, :cond_4

    iget-object v2, p0, Ldaz;->f:[Ldba;

    array-length v2, v2

    if-lez v2, :cond_4

    move v2, v0

    move v0, v1

    .line 243
    :goto_0
    iget-object v3, p0, Ldaz;->f:[Ldba;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 244
    iget-object v3, p0, Ldaz;->f:[Ldba;

    aget-object v3, v3, v0

    .line 245
    if-eqz v3, :cond_2

    .line 246
    const/4 v4, 0x3

    .line 247
    invoke-static {v4, v3}, Ldep;->b(ILdew;)I

    move-result v3

    add-int/2addr v2, v3

    .line 243
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    .line 251
    :cond_4
    iget-object v2, p0, Ldaz;->c:Ljava/lang/Boolean;

    if-eqz v2, :cond_5

    .line 252
    const/4 v2, 0x4

    iget-object v3, p0, Ldaz;->c:Ljava/lang/Boolean;

    .line 253
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3620
    invoke-static {v2}, Ldep;->b(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 253
    add-int/2addr v0, v2

    .line 255
    :cond_5
    iget-object v2, p0, Ldaz;->g:Ljava/lang/Boolean;

    if-eqz v2, :cond_6

    .line 256
    const/4 v2, 0x5

    iget-object v3, p0, Ldaz;->g:Ljava/lang/Boolean;

    .line 257
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4620
    invoke-static {v2}, Ldep;->b(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 257
    add-int/2addr v0, v2

    .line 259
    :cond_6
    iget-object v2, p0, Ldaz;->e:Ljava/lang/String;

    if-eqz v2, :cond_7

    .line 260
    const/4 v2, 0x6

    iget-object v3, p0, Ldaz;->e:Ljava/lang/String;

    .line 261
    invoke-static {v2, v3}, Ldep;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    .line 263
    :cond_7
    iget-object v2, p0, Ldaz;->d:[Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v2, p0, Ldaz;->d:[Ljava/lang/String;

    array-length v2, v2

    if-lez v2, :cond_a

    move v2, v1

    move v3, v1

    .line 266
    :goto_1
    iget-object v4, p0, Ldaz;->d:[Ljava/lang/String;

    array-length v4, v4

    if-ge v1, v4, :cond_9

    .line 267
    iget-object v4, p0, Ldaz;->d:[Ljava/lang/String;

    aget-object v4, v4, v1

    .line 268
    if-eqz v4, :cond_8

    .line 269
    add-int/lit8 v3, v3, 0x1

    .line 271
    invoke-static {v4}, Ldep;->a(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v2, v4

    .line 266
    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 274
    :cond_9
    add-int/2addr v0, v2

    .line 275
    mul-int/lit8 v1, v3, 0x1

    add-int/2addr v0, v1

    .line 277
    :cond_a
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 5285
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 5286
    sparse-switch v0, :sswitch_data_0

    .line 5290
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5291
    :sswitch_0
    return-object p0

    .line 5296
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldaz;->a:Ljava/lang/Boolean;

    goto :goto_0

    .line 5300
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldaz;->b:Ljava/lang/Boolean;

    goto :goto_0

    .line 5304
    :sswitch_3
    const/16 v0, 0x1a

    .line 5305
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 5306
    iget-object v0, p0, Ldaz;->f:[Ldba;

    if-nez v0, :cond_2

    move v0, v1

    .line 5307
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldba;

    .line 5309
    if-eqz v0, :cond_1

    .line 5310
    iget-object v3, p0, Ldaz;->f:[Ldba;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5312
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 5313
    new-instance v3, Ldba;

    invoke-direct {v3}, Ldba;-><init>()V

    aput-object v3, v2, v0

    .line 5314
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 5315
    invoke-virtual {p1}, Ldeo;->a()I

    .line 5312
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 5306
    :cond_2
    iget-object v0, p0, Ldaz;->f:[Ldba;

    array-length v0, v0

    goto :goto_1

    .line 5318
    :cond_3
    new-instance v3, Ldba;

    invoke-direct {v3}, Ldba;-><init>()V

    aput-object v3, v2, v0

    .line 5319
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 5320
    iput-object v2, p0, Ldaz;->f:[Ldba;

    goto :goto_0

    .line 5324
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldaz;->c:Ljava/lang/Boolean;

    goto :goto_0

    .line 5328
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldaz;->g:Ljava/lang/Boolean;

    goto :goto_0

    .line 5332
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldaz;->e:Ljava/lang/String;

    goto :goto_0

    .line 5336
    :sswitch_7
    const/16 v0, 0x3a

    .line 5337
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 5338
    iget-object v0, p0, Ldaz;->d:[Ljava/lang/String;

    if-nez v0, :cond_5

    move v0, v1

    .line 5339
    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    .line 5340
    if-eqz v0, :cond_4

    .line 5341
    iget-object v3, p0, Ldaz;->d:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5343
    :cond_4
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_6

    .line 5344
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 5345
    invoke-virtual {p1}, Ldeo;->a()I

    .line 5343
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 5338
    :cond_5
    iget-object v0, p0, Ldaz;->d:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_3

    .line 5348
    :cond_6
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 5349
    iput-object v2, p0, Ldaz;->d:[Ljava/lang/String;

    goto/16 :goto_0

    .line 5286
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x28 -> :sswitch_5
        0x32 -> :sswitch_6
        0x3a -> :sswitch_7
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 197
    iget-object v0, p0, Ldaz;->a:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 198
    const/4 v0, 0x1

    iget-object v2, p0, Ldaz;->a:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1, v0, v2}, Ldep;->a(IZ)V

    .line 200
    :cond_0
    iget-object v0, p0, Ldaz;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 201
    const/4 v0, 0x2

    iget-object v2, p0, Ldaz;->b:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1, v0, v2}, Ldep;->a(IZ)V

    .line 203
    :cond_1
    iget-object v0, p0, Ldaz;->f:[Ldba;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ldaz;->f:[Ldba;

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v1

    .line 204
    :goto_0
    iget-object v2, p0, Ldaz;->f:[Ldba;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    .line 205
    iget-object v2, p0, Ldaz;->f:[Ldba;

    aget-object v2, v2, v0

    .line 206
    if-eqz v2, :cond_2

    .line 207
    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Ldep;->a(ILdew;)V

    .line 204
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 211
    :cond_3
    iget-object v0, p0, Ldaz;->c:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 212
    const/4 v0, 0x4

    iget-object v2, p0, Ldaz;->c:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1, v0, v2}, Ldep;->a(IZ)V

    .line 214
    :cond_4
    iget-object v0, p0, Ldaz;->g:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    .line 215
    const/4 v0, 0x5

    iget-object v2, p0, Ldaz;->g:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1, v0, v2}, Ldep;->a(IZ)V

    .line 217
    :cond_5
    iget-object v0, p0, Ldaz;->e:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 218
    const/4 v0, 0x6

    iget-object v2, p0, Ldaz;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Ldep;->a(ILjava/lang/String;)V

    .line 220
    :cond_6
    iget-object v0, p0, Ldaz;->d:[Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Ldaz;->d:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_8

    .line 221
    :goto_1
    iget-object v0, p0, Ldaz;->d:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_8

    .line 222
    iget-object v0, p0, Ldaz;->d:[Ljava/lang/String;

    aget-object v0, v0, v1

    .line 223
    if-eqz v0, :cond_7

    .line 224
    const/4 v2, 0x7

    invoke-virtual {p1, v2, v0}, Ldep;->a(ILjava/lang/String;)V

    .line 221
    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 228
    :cond_8
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 229
    return-void
.end method
