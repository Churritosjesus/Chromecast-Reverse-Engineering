.class final Ldj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 844
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 844
    .line 2848
    new-instance v0, Ldi;

    .line 3745
    invoke-direct {v0, p1}, Ldi;-><init>(Landroid/os/Parcel;)V

    .line 844
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 844
    .line 1853
    new-array v0, p1, [Ldi;

    .line 844
    return-object v0
.end method
