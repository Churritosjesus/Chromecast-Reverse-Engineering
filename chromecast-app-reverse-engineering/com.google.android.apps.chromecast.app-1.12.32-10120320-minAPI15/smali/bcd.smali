.class public final Lbcd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final a:Ldbk;

.field public final b:Ljava/lang/String;

.field public final c:I

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    new-instance v0, Lbce;

    invoke-direct {v0}, Lbce;-><init>()V

    sput-object v0, Lbcd;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 65
    new-array v0, v0, [B

    .line 66
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readByteArray([B)V

    .line 67
    const/4 v1, 0x0

    .line 2153
    :try_start_0
    new-instance v2, Ldbk;

    invoke-direct {v2}, Ldbk;-><init>()V

    invoke-static {v2, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbk;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :goto_0
    iput-object v0, p0, Lbcd;->a:Ldbk;

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbcd;->d:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbcd;->b:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lbcd;->c:I

    .line 78
    return-void

    .line 70
    :catch_0
    move-exception v0

    .line 72
    const-string v2, "OfferData"

    const-string v3, "Failed to unparcel OfferData: "

    invoke-virtual {v0}, Ldev;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public constructor <init>(Ldbk;Laow;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lbcd;->a:Ldbk;

    .line 40
    if-nez p2, :cond_0

    const-string v0, ""

    :goto_0
    iput-object v0, p0, Lbcd;->d:Ljava/lang/String;

    .line 41
    if-nez p2, :cond_1

    const-string v0, ""

    :goto_1
    iput-object v0, p0, Lbcd;->b:Ljava/lang/String;

    .line 42
    if-nez p2, :cond_2

    const/4 v0, 0x0

    :goto_2
    iput v0, p0, Lbcd;->c:I

    .line 43
    return-void

    .line 1432
    :cond_0
    iget-object v0, p2, Laow;->a:Ljava/lang/String;

    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p2}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p2}, Laow;->h()I

    move-result v0

    goto :goto_2
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .prologue
    .line 132
    iget-object v0, p0, Lbcd;->a:Ldbk;

    iget-object v0, v0, Ldbk;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbcd;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 113
    if-ne p1, p0, :cond_0

    .line 114
    const/4 v0, 0x1

    .line 119
    :goto_0
    return v0

    .line 116
    :cond_0
    instance-of v0, p1, Lbcd;

    if-nez v0, :cond_1

    .line 117
    const/4 v0, 0x0

    goto :goto_0

    .line 119
    :cond_1
    check-cast p1, Lbcd;

    invoke-virtual {p1}, Lbcd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lbcd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 124
    invoke-virtual {p0}, Lbcd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lbcd;->a:Ldbk;

    invoke-static {v0}, Ldbk;->a(Ldew;)[B

    move-result-object v0

    .line 88
    array-length v1, v0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 89
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 90
    iget-object v0, p0, Lbcd;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lbcd;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 92
    iget v0, p0, Lbcd;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    return-void
.end method
