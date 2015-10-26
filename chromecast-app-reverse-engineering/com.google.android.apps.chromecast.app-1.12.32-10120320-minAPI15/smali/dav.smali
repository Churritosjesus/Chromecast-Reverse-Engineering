.class public final Ldav;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:[Ldaw;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 195
    invoke-direct {p0}, Ldew;-><init>()V

    .line 196
    iput-object v0, p0, Ldav;->a:Ljava/lang/String;

    .line 197
    iput-object v0, p0, Ldav;->b:Ljava/lang/String;

    .line 198
    iput-object v0, p0, Ldav;->c:Ljava/lang/String;

    .line 199
    iput-object v0, p0, Ldav;->d:Ljava/lang/String;

    .line 200
    invoke-static {}, Ldaw;->b()[Ldaw;

    move-result-object v0

    iput-object v0, p0, Ldav;->e:[Ldaw;

    .line 201
    const/4 v0, -0x1

    iput v0, p0, Ldav;->t:I

    .line 202
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    .line 232
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 233
    iget-object v1, p0, Ldav;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 234
    const/4 v1, 0x1

    iget-object v2, p0, Ldav;->a:Ljava/lang/String;

    .line 235
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 237
    :cond_0
    iget-object v1, p0, Ldav;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 238
    const/4 v1, 0x2

    iget-object v2, p0, Ldav;->b:Ljava/lang/String;

    .line 239
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 241
    :cond_1
    iget-object v1, p0, Ldav;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 242
    const/4 v1, 0x3

    iget-object v2, p0, Ldav;->c:Ljava/lang/String;

    .line 243
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 245
    :cond_2
    iget-object v1, p0, Ldav;->d:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 246
    const/4 v1, 0x4

    iget-object v2, p0, Ldav;->d:Ljava/lang/String;

    .line 247
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 249
    :cond_3
    iget-object v1, p0, Ldav;->e:[Ldaw;

    if-eqz v1, :cond_6

    iget-object v1, p0, Ldav;->e:[Ldaw;

    array-length v1, v1

    if-lez v1, :cond_6

    .line 250
    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Ldav;->e:[Ldaw;

    array-length v2, v2

    if-ge v0, v2, :cond_5

    .line 251
    iget-object v2, p0, Ldav;->e:[Ldaw;

    aget-object v2, v2, v0

    .line 252
    if-eqz v2, :cond_4

    .line 253
    const/4 v3, 0x5

    .line 254
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 250
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    move v0, v1

    .line 258
    :cond_6
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1266
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1267
    sparse-switch v0, :sswitch_data_0

    .line 1271
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1272
    :sswitch_0
    return-object p0

    .line 1277
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldav;->a:Ljava/lang/String;

    goto :goto_0

    .line 1281
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldav;->b:Ljava/lang/String;

    goto :goto_0

    .line 1285
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldav;->c:Ljava/lang/String;

    goto :goto_0

    .line 1289
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldav;->d:Ljava/lang/String;

    goto :goto_0

    .line 1293
    :sswitch_5
    const/16 v0, 0x2a

    .line 1294
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1295
    iget-object v0, p0, Ldav;->e:[Ldaw;

    if-nez v0, :cond_2

    move v0, v1

    .line 1296
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldaw;

    .line 1298
    if-eqz v0, :cond_1

    .line 1299
    iget-object v3, p0, Ldav;->e:[Ldaw;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1301
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 1302
    new-instance v3, Ldaw;

    invoke-direct {v3}, Ldaw;-><init>()V

    aput-object v3, v2, v0

    .line 1303
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1304
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1301
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1295
    :cond_2
    iget-object v0, p0, Ldav;->e:[Ldaw;

    array-length v0, v0

    goto :goto_1

    .line 1307
    :cond_3
    new-instance v3, Ldaw;

    invoke-direct {v3}, Ldaw;-><init>()V

    aput-object v3, v2, v0

    .line 1308
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1309
    iput-object v2, p0, Ldav;->e:[Ldaw;

    goto :goto_0

    .line 1267
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 207
    iget-object v0, p0, Ldav;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 208
    const/4 v0, 0x1

    iget-object v1, p0, Ldav;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 210
    :cond_0
    iget-object v0, p0, Ldav;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 211
    const/4 v0, 0x2

    iget-object v1, p0, Ldav;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 213
    :cond_1
    iget-object v0, p0, Ldav;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 214
    const/4 v0, 0x3

    iget-object v1, p0, Ldav;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 216
    :cond_2
    iget-object v0, p0, Ldav;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 217
    const/4 v0, 0x4

    iget-object v1, p0, Ldav;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 219
    :cond_3
    iget-object v0, p0, Ldav;->e:[Ldaw;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ldav;->e:[Ldaw;

    array-length v0, v0

    if-lez v0, :cond_5

    .line 220
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldav;->e:[Ldaw;

    array-length v1, v1

    if-ge v0, v1, :cond_5

    .line 221
    iget-object v1, p0, Ldav;->e:[Ldaw;

    aget-object v1, v1, v0

    .line 222
    if-eqz v1, :cond_4

    .line 223
    const/4 v2, 0x5

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 220
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 227
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 228
    return-void
.end method
