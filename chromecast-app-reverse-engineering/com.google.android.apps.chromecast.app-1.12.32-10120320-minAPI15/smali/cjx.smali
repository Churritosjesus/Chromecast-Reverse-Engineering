.class public abstract Lcjx;
.super Landroid/os/Binder;

# interfaces
.implements Lcjw;


# direct methods
.method public static a(Landroid/os/IBinder;)Lcjw;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcjw;

    if-eqz v1, :cond_1

    check-cast v0, Lcjw;

    goto :goto_0

    :cond_1
    new-instance v0, Lcjy;

    invoke-direct {v0, p0}, Lcjy;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    .line 0
    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v6

    :goto_0
    return v6

    :sswitch_0
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcju;->a(Landroid/os/IBinder;)Lcjt;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v2, v6

    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Landroid/view/Surface;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    move-object v4, v0

    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcjx;->a(Lcjt;ZLjava/lang/String;Landroid/view/Surface;I)V

    goto :goto_0

    :sswitch_2
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcjx;->a()V

    goto :goto_0

    :sswitch_3
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcjx;->b()V

    goto :goto_0

    :sswitch_4
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcju;->a(Landroid/os/IBinder;)Lcjt;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    .line 1000
    if-nez v1, :cond_2

    move-object v1, v4

    .line 0
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    :goto_2
    invoke-virtual {p0, v2, v1, v3, v0}, Lcjx;->a(Lcjt;Lcjz;Ljava/lang/String;Landroid/app/PendingIntent;)V

    goto :goto_0

    .line 1000
    :cond_2
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks"

    invoke-interface {v1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_3

    instance-of v3, v0, Lcjz;

    if-eqz v3, :cond_3

    check-cast v0, Lcjz;

    move-object v1, v0

    goto :goto_1

    :cond_3
    new-instance v0, Lckb;

    invoke-direct {v0, v1}, Lckb;-><init>(Landroid/os/IBinder;)V

    move-object v1, v0

    goto :goto_1

    :cond_4
    move-object v0, v4

    .line 0
    goto :goto_2

    :sswitch_5
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcju;->a(Landroid/os/IBinder;)Lcjt;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcjx;->a(Lcjt;)V

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcju;->a(Landroid/os/IBinder;)Lcjt;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcjx;->b(Lcjt;)V

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_5

    move v2, v6

    :cond_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcjx;->a(ZLjava/lang/String;)V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
