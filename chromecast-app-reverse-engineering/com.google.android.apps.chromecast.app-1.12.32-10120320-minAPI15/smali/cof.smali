.class public final Lcof;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/os/Parcel;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    .locals 9

    .prologue
    const/4 v6, 0x0

    .line 0
    invoke-static {p0}, La;->a(Landroid/os/Parcel;)I

    move-result v7

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v5, v6

    move-object v4, v6

    move-object v3, v6

    :goto_0
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-ge v0, v7, :cond_0

    .line 1000
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 2000
    const v8, 0xffff

    and-int/2addr v8, v0

    .line 0
    sparse-switch v8, :sswitch_data_0

    invoke-static {p0, v0}, La;->b(Landroid/os/Parcel;I)V

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v0}, La;->d(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v0}, La;->d(Landroid/os/Parcel;I)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget-object v3, Lcom/google/android/gms/location/internal/LocationRequestInternal;->CREATOR:Lcoe;

    invoke-static {p0, v0, v3}, La;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/LocationRequestInternal;

    move-object v3, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v0}, La;->i(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v4

    goto :goto_0

    :sswitch_4
    sget-object v5, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p0, v0, v5}, La;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v0}, La;->i(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-eq v0, v7, :cond_1

    new-instance v0, Ll;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Overread allowed size end="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ll;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;-><init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x3e8 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;Landroid/os/Parcel;I)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 0
    .line 3000
    const/16 v0, 0x4f45

    invoke-static {p1, v0}, La;->m(Landroid/os/Parcel;I)I

    move-result v2

    .line 0
    const/4 v0, 0x1

    iget v3, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->b:I

    invoke-static {p1, v0, v3}, La;->c(Landroid/os/Parcel;II)V

    const/16 v0, 0x3e8

    .line 4000
    iget v3, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->a:I

    .line 0
    invoke-static {p1, v0, v3}, La;->c(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget-object v3, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->c:Lcom/google/android/gms/location/internal/LocationRequestInternal;

    invoke-static {p1, v0, v3, p2, v4}, La;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v3, 0x3

    .line 5000
    iget-object v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->d:Lcon;

    if-nez v0, :cond_0

    move-object v0, v1

    .line 0
    :goto_0
    invoke-static {p1, v3, v0, v4}, La;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x4

    iget-object v3, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->e:Landroid/app/PendingIntent;

    invoke-static {p1, v0, v3, p2, v4}, La;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v0, 0x5

    .line 6000
    iget-object v3, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->f:Lcok;

    if-nez v3, :cond_1

    .line 0
    :goto_1
    invoke-static {p1, v0, v1, v4}, La;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 7000
    invoke-static {p1, v2}, La;->n(Landroid/os/Parcel;I)V

    .line 0
    return-void

    .line 5000
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->d:Lcon;

    invoke-interface {v0}, Lcon;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    .line 6000
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->f:Lcok;

    invoke-interface {v1}, Lcok;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    goto :goto_1
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lcof;->a(Landroid/os/Parcel;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 0
    .line 8000
    new-array v0, p1, [Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    .line 0
    return-object v0
.end method
