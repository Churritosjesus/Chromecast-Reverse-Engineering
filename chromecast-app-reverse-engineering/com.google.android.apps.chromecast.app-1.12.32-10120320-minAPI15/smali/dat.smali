.class public final Ldat;
.super Ldew;
.source "PG"


# instance fields
.field public a:[Ldau;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 162
    invoke-direct {p0}, Ldew;-><init>()V

    .line 163
    invoke-static {}, Ldau;->b()[Ldau;

    move-result-object v0

    iput-object v0, p0, Ldat;->a:[Ldau;

    .line 164
    const/4 v0, -0x1

    iput v0, p0, Ldat;->t:I

    .line 165
    return-void
.end method

.method public static a([B)Ldat;
    .locals 1

    .prologue
    .line 237
    new-instance v0, Ldat;

    invoke-direct {v0}, Ldat;-><init>()V

    invoke-static {v0, p0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldat;

    return-object v0
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 183
    invoke-super {p0}, Ldew;->a()I

    move-result v1

    .line 184
    iget-object v0, p0, Ldat;->a:[Ldau;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldat;->a:[Ldau;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 185
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Ldat;->a:[Ldau;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 186
    iget-object v2, p0, Ldat;->a:[Ldau;

    aget-object v2, v2, v0

    .line 187
    if-eqz v2, :cond_0

    .line 188
    const/4 v3, 0x1

    .line 189
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 185
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 193
    :cond_1
    return v1
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1201
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1202
    sparse-switch v0, :sswitch_data_0

    .line 1206
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1207
    :sswitch_0
    return-object p0

    .line 1212
    :sswitch_1
    const/16 v0, 0xa

    .line 1213
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1214
    iget-object v0, p0, Ldat;->a:[Ldau;

    if-nez v0, :cond_2

    move v0, v1

    .line 1215
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldau;

    .line 1217
    if-eqz v0, :cond_1

    .line 1218
    iget-object v3, p0, Ldat;->a:[Ldau;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1220
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 1221
    new-instance v3, Ldau;

    invoke-direct {v3}, Ldau;-><init>()V

    aput-object v3, v2, v0

    .line 1222
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1223
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1220
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1214
    :cond_2
    iget-object v0, p0, Ldat;->a:[Ldau;

    array-length v0, v0

    goto :goto_1

    .line 1226
    :cond_3
    new-instance v3, Ldau;

    invoke-direct {v3}, Ldau;-><init>()V

    aput-object v3, v2, v0

    .line 1227
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1228
    iput-object v2, p0, Ldat;->a:[Ldau;

    goto :goto_0

    .line 1202
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 170
    iget-object v0, p0, Ldat;->a:[Ldau;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldat;->a:[Ldau;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 171
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldat;->a:[Ldau;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 172
    iget-object v1, p0, Ldat;->a:[Ldau;

    aget-object v1, v1, v0

    .line 173
    if-eqz v1, :cond_0

    .line 174
    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 171
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_1
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 179
    return-void
.end method
