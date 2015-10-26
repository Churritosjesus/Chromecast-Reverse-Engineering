.class public final Lcoj;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/os/Parcel;)Lcom/google/android/gms/location/GestureRequest;
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 0
    invoke-static {p0}, La;->a(Landroid/os/Parcel;)I

    move-result v5

    move-object v0, v1

    move v2, v3

    :goto_0
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v5, :cond_2

    .line 1000
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 2000
    const v6, 0xffff

    and-int/2addr v6, v4

    .line 0
    sparse-switch v6, :sswitch_data_0

    invoke-static {p0, v4}, La;->b(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 3000
    :sswitch_0
    invoke-static {p0, v4}, La;->a(Landroid/os/Parcel;I)I

    move-result v6

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-nez v6, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    move v4, v3

    :goto_1
    if-ge v4, v8, :cond_1

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int v4, v7, v6

    invoke-virtual {p0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    goto :goto_0

    .line 0
    :sswitch_1
    invoke-static {p0, v4}, La;->d(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-eq v1, v5, :cond_3

    new-instance v0, Ll;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Overread allowed size end="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ll;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v0

    :cond_3
    new-instance v1, Lcom/google/android/gms/location/GestureRequest;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/location/GestureRequest;-><init>(ILjava/util/List;)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3e8 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Lcom/google/android/gms/location/GestureRequest;Landroid/os/Parcel;)V
    .locals 6

    .prologue
    .line 0
    .line 4000
    const/16 v0, 0x4f45

    invoke-static {p1, v0}, La;->m(Landroid/os/Parcel;I)I

    move-result v2

    .line 5000
    iget-object v3, p0, Lcom/google/android/gms/location/GestureRequest;->b:Ljava/util/List;

    .line 6000
    if-eqz v3, :cond_1

    const/4 v0, 0x1

    invoke-static {p1, v0}, La;->m(Landroid/os/Parcel;I)I

    move-result v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v5, :cond_0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-static {p1, v4}, La;->n(Landroid/os/Parcel;I)V

    .line 0
    :cond_1
    const/16 v0, 0x3e8

    .line 7000
    iget v1, p0, Lcom/google/android/gms/location/GestureRequest;->a:I

    .line 0
    invoke-static {p1, v0, v1}, La;->c(Landroid/os/Parcel;II)V

    .line 8000
    invoke-static {p1, v2}, La;->n(Landroid/os/Parcel;I)V

    .line 0
    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lcoj;->a(Landroid/os/Parcel;)Lcom/google/android/gms/location/GestureRequest;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 0
    .line 9000
    new-array v0, p1, [Lcom/google/android/gms/location/GestureRequest;

    .line 0
    return-object v0
.end method
