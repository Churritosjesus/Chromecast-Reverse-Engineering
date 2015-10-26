.class final Ldl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 882
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 882
    .line 2885
    new-instance v0, Ldk;

    invoke-direct {v0, p1}, Ldk;-><init>(Landroid/os/Parcel;)V

    .line 882
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 882
    .line 1890
    new-array v0, p1, [Ldk;

    .line 882
    return-object v0
.end method
