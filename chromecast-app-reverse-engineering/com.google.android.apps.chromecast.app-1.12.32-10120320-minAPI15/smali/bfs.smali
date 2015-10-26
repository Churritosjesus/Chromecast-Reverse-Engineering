.class public final Lbfs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;

.field private static final j:[B


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lbfu;

.field c:Lbfv;

.field d:I

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Z

.field public h:I

.field public i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/16 v0, 0x18

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lbfs;->j:[B

    .line 290
    new-instance v0, Lbft;

    invoke-direct {v0}, Lbft;-><init>()V

    sput-object v0, Lbfs;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void

    .line 32
    nop

    :array_0
    .array-data 1
        0x30t
        -0x7et
        0x0t
        -0x61t
        0x30t
        0xdt
        0x6t
        0x9t
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x1t
        0x1t
        0x1t
        0x5t
        0x0t
        0x3t
        -0x7et
        0x0t
        -0x73t
        0x0t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 261
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lbfs;->a:Ljava/lang/String;

    .line 262
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfu;

    iput-object v0, p0, Lbfs;->b:Lbfu;

    .line 263
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfv;

    iput-object v0, p0, Lbfs;->c:Lbfv;

    .line 264
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lbfs;->d:I

    .line 265
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lbfs;->e:Ljava/lang/String;

    .line 266
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lbfs;->f:Z

    .line 267
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    iput-boolean v1, p0, Lbfs;->g:Z

    .line 268
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lbfs;->h:I

    .line 269
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lbfs;->i:Ljava/lang/String;

    .line 270
    return-void

    :cond_0
    move v0, v2

    .line 266
    goto :goto_0

    :cond_1
    move v1, v2

    .line 267
    goto :goto_1
.end method

.method public constructor <init>(Lbfs;)V
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1130
    iget-object v0, p1, Lbfs;->a:Ljava/lang/String;

    .line 114
    iput-object v0, p0, Lbfs;->a:Ljava/lang/String;

    .line 1138
    iget-object v0, p1, Lbfs;->b:Lbfu;

    .line 115
    iput-object v0, p0, Lbfs;->b:Lbfu;

    .line 1146
    iget-object v0, p1, Lbfs;->c:Lbfv;

    .line 116
    iput-object v0, p0, Lbfs;->c:Lbfv;

    .line 1154
    iget v0, p1, Lbfs;->d:I

    .line 117
    iput v0, p0, Lbfs;->d:I

    .line 1162
    iget-object v0, p1, Lbfs;->e:Ljava/lang/String;

    .line 118
    iput-object v0, p0, Lbfs;->e:Ljava/lang/String;

    .line 1170
    iget-boolean v0, p1, Lbfs;->f:Z

    .line 119
    iput-boolean v0, p0, Lbfs;->f:Z

    .line 1178
    iget-boolean v0, p1, Lbfs;->g:Z

    .line 120
    iput-boolean v0, p0, Lbfs;->g:Z

    .line 1187
    iget v0, p1, Lbfs;->h:I

    .line 121
    iput v0, p0, Lbfs;->h:I

    .line 1195
    iget-object v0, p1, Lbfs;->i:Ljava/lang/String;

    .line 122
    iput-object v0, p0, Lbfs;->i:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x0

    .line 221
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "No public key available from Chromecast"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 224
    :cond_0
    invoke-static {p1, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 225
    sget-object v1, Lbfs;->j:[B

    array-length v1, v1

    array-length v2, v0

    add-int/2addr v1, v2

    new-array v1, v1, [B

    .line 226
    sget-object v2, Lbfs;->j:[B

    sget-object v3, Lbfs;->j:[B

    array-length v3, v3

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 227
    sget-object v2, Lbfs;->j:[B

    array-length v2, v2

    array-length v3, v0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 230
    array-length v2, v1

    add-int/lit8 v2, v2, -0x4

    invoke-static {v1, v5, v2}, Lbfs;->a([BII)V

    .line 231
    const/16 v2, 0x15

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v2, v0}, Lbfs;->a([BII)V

    .line 233
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v0, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 234
    const-string v1, "RSA"

    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    .line 237
    const-string v1, "RSA/None/PKCS1Padding"

    const-string v2, "BC"

    invoke-static {v1, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 238
    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 239
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    .line 240
    invoke-static {v0, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a([BII)V
    .locals 2

    .prologue
    .line 251
    div-int/lit16 v0, p2, 0x100

    int-to-byte v0, v0

    aput-byte v0, p0, p1

    .line 252
    add-int/lit8 v0, p1, 0x1

    rem-int/lit16 v1, p2, 0x100

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 253
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .prologue
    .line 274
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lbfs;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 279
    iget-object v0, p0, Lbfs;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lbfs;->b:Lbfu;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lbfs;->c:Lbfv;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 282
    iget v0, p0, Lbfs;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 283
    iget-object v0, p0, Lbfs;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 284
    iget-boolean v0, p0, Lbfs;->f:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 285
    iget-boolean v0, p0, Lbfs;->g:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 286
    iget v0, p0, Lbfs;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 287
    iget-object v0, p0, Lbfs;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 288
    return-void

    :cond_0
    move v0, v2

    .line 284
    goto :goto_0

    :cond_1
    move v1, v2

    .line 285
    goto :goto_1
.end method
